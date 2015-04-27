
package edu.ggc.mdeiters.FinalProject;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Class: CrazyEightsUI
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Apr 14, 2015
 * 
 * Class Description: Creates the playable area for the game
 * 
 * Purpose: Controls the UI of the game
 *
 */
public class CrazyEightsUI extends Application {

	private ArrayList<ImageView> compCardList;
	private ArrayList<ImageView> humanCardList;
	private ArrayList<ImageView> eights;
	private Label prompt;
	private Label compErrors;
	private TextArea rules;
	private BorderPane table;
	private BorderPane deckPane;
	private BorderPane humanPane;
	private BorderPane humanTextPane;
	private BorderPane computerPane;
	private FlowPane eightsPane;
	private GridPane btnPane;
	private Scene scene;
	private Stage mainStage;
	private CardImg imgs;

	private Button playBtn;
	private Button playAgainBtn;
	private Button rulesBtn;
	private Button exitBtn;
	private Button backBtn;
	private Button sortBtn;

	private FlowPane humanImgView;
	private FlowPane compImgView;
	private ImageView deckImg;
	private ImageView discardImg;

	private GameRules gameRules;
	private CardDeck deck;
	private DiscardPile discardPile;
	private Player human;
	private ComputerPlayer computer;
	private Hand eightsHand;

	private Boolean humanTurn;
	private Boolean humanHasPlayed;
	private Boolean computerHasPlayed;

	/**
	 * Method: setupGame 
	 * @return void
	 * Method Description: Sets up a new game of Crazy 8's
	 */
	public void setupGame() {

		// Clears the label fields

		prompt.setText("");
		compErrors.setText("");

		// (Re)creates the humanImgView and compImgView

		humanImgView = new FlowPane();
		humanImgView.setVgap(10);
		humanImgView.setPrefWrapLength(780);

		compImgView = new FlowPane();
		compImgView.setVgap(10);
		compImgView.setPrefWrapLength(780);

		// Creates the BorderPanes

		humanPane = new BorderPane();
		humanTextPane = new BorderPane();
		computerPane = new BorderPane();

		// Creates the wild card menu

		eightsPane = new FlowPane();
		eightsPane.setMaxWidth(400);
		eightsPane.setMaxHeight(100);

		// Creates the deck and discardPile interface

		deckPane = new BorderPane();
		deckImg = new ImageView();
		discardImg = new ImageView();
		deckPane.setLeft(discardImg);
		deckPane.setRight(deckImg);
		deckPane.setMaxSize(200, 100);

		// Aligns the content up on the table

		table.setTop(computerPane);
		computerPane.setTop(backBtn);
		computerPane.setCenter(compImgView);
		computerPane.setBottom(compErrors);
		computerPane.setMargin(backBtn, new Insets(0, 0, 10, 0));

		table.setBottom(humanPane);
		humanTextPane.setLeft(prompt);
		humanTextPane.setRight(sortBtn);
		humanPane.setTop(humanTextPane);
		humanPane.setCenter(null);
		humanPane.setBottom(humanImgView);
		humanPane.setMargin(prompt, new Insets(10, 0, 10, 0));

		table.setCenter(deckPane);
		table.setMargin(deckPane, new Insets(10));

		try {

			// Default value controls

			humanTurn = false;
			humanHasPlayed = false;
			computerHasPlayed = false;

			// Creates a new deck and shuffles it

			deck = new CardDeck();
			deck.shuffle();

			// Creates the discardPile

			discardPile = new DiscardPile();

			// Initiates the human and computer players

			human = new Player();
			computer = new ComputerPlayer();

			for (int i = 0; i < gameRules.getStartingHand(); i++) { // Deals out the number of cards assigned in gameRules to each player

				human.drawCard(deck);
				computer.drawCard(deck);

			}

			// Assigns the cardBack img to the deckImg

			deckImg.setImage(new Image(imgs.cardBack));

			// Defines the ArrayList of the card images for each player's hand

			humanCardList = new ArrayList<ImageView>();
			compCardList = new ArrayList<ImageView>();

			// Retrieves the images for the player's cards

			getImages(humanCardList, human, humanImgView);
			getImages(compCardList, computer, compImgView);

			// Flips over the top card of the deck and displays it's image

			discardPile.addCard(deck.deal());
			discardImg.setImage(new Image(imgs.findImage(discardPile.getTopCard())));

			// Redefines the stage's width and height

			mainStage.setMinWidth(700);
			mainStage.sizeToScene();

			// Defines the wild card menu

			eights = new ArrayList<ImageView>();
			eightsHand = new Hand(new Card(0, 8), new Card(1, 8), new Card(2, 8), new Card(3, 8));
			getImages(eights, eightsHand, eightsPane);

			// Starts the game

			cardActions();
			playGame();
		}
		catch (InvalidCardException ice) {

			prompt.setText(ice.getMessage());
		}
	}

	/**
	 * Method: playGame 
	 * @return void
	 * Method Description: Controls the game play between the human and the computer
	 */
	public void playGame() {

		// Adjusts the stage height to ensure that all of the card are displayed

		mainStage.sizeToScene();

		// Lets the human play

		humanTurn = true;

		if (humanHasPlayed) { // If the human hasPlayed then set humanTurn to false and reset computerHasPlayed to false

			humanTurn = false;
			computerHasPlayed = false;
		}

		if (!humanTurn) { // If it is not the human's turn then let the computer play

			if (gameRules.hasWon(human.getPlayerHand())) { // If the human has won then stop the game and 

				// Prompts the user that he/she has won and asks if they want to play again

				prompt.setText("You Won");
				humanPane.setCenter(playAgainBtn);
			}
			else { // Else the computer plays

				try {

					// Assigns the return of nextMove to card

					Card card = computer.nextMove(discardPile, deck);

					if (card != null) { // If card is not null then play the card to discardPile and redraw the computer's hand

						// Set computerHasPlayed to true

						computerHasPlayed = true;

						// Finds the image of the card to remove from the computer's hand

						ImageView img = new ImageView(new Image(imgs.findImage(card)));

						// Plays card on the discardPile

						discardPile.addCard(card);

						// Finds the image of the top card of discardPile

						discardImg.setImage(new Image(imgs.findImage(discardPile.getTopCard())));

						// Redraws the computer's hand

						compImgView.getChildren().removeAll(compCardList);
						compCardList.remove(img);
						getImages(compCardList, computer, compImgView);

					}
					else {

						throw new InvalidCardException("Computer didn't select a card");
					}
				}
				catch (InvalidCardException ice) {

					compErrors.setText(ice.getMessage());
				}
				catch (IndexOutOfBoundsException iob) {

					compErrors.setText(iob.getMessage());
				}
				catch (Exception e) {

					compErrors.setText(e.getMessage());
				}
			}

			if (gameRules.hasWon(computer.getPlayerHand())) { // If the computer wins then stop the game to prompt the user that he/she lost and asks them if they would like to play again

				prompt.setText("You Lost");
				humanPane.setCenter(playAgainBtn);
			}
			else if (computerHasPlayed) { // If computerHasPlayed then reset humanHasPlayed and relaunch playGame

				humanHasPlayed = false;
				playGame();
			}
		}
	}

	/**
	 * Method: getImages 
	 * @param view ArrayList of ImageViews
	 * @param player Player whos hand is being drawn
	 * @param pane FlowPane of the player
	 * Method Description: Pulls the images from the CardImg class to display the card images
	 */
	public void getImages(ArrayList<ImageView> view, Player player, FlowPane pane) {

		// Assigns the player's hand to playerHand

		Hand playerHand = player.getPlayerHand();

		// Clears the player's pane and view

		pane.getChildren().removeAll(view);
		view.removeAll(view);

		if (view == humanCardList) { // If it is the humanCardList then display the human's cards

			for (int i = 0; i < playerHand.getHand().size(); i++) { // Loop through the player's hand

				// Assigns the indexed card to card

				Card card = playerHand.getHand().get(i);

				// Finds the image of card

				ImageView img = new ImageView(imgs.findImage(card));

				// Adds the ImageView of card to the player's pane and view

				pane.getChildren().add(img);
				pane.setMargin(img, new Insets(10, 10, 0, 0));
				view.add(img);

				view.get(i).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() { // Creates a MouseClick EventHandler for each card

							@Override
							public void handle(MouseEvent arg0) {

								if (humanTurn) { // If it is the human's turn allow him/her to play

									if (player.playCard(card, discardPile.getTopCard())) { // If the card the player picked is valid then play the card

										// Clear the prompt and add card to the discardPile

										prompt.setText("");
										discardPile.addCard(card);

										if (card.getValue() == 8) { // If the card is an eight then pull up the wild card menu

											table.setCenter(eightsPane);
										}
										else { // Otherwise set humanHasPlayed to true

											humanHasPlayed = true;
										}

										// Find the image for the top card of discardPile

										discardImg.setImage(new Image(imgs.findImage(discardPile.getTopCard())));

										// Redrawing the player's hand and relaunches playGame

										pane.getChildren().removeAll(view);
										view.remove(img);
										getImages(view, player, pane);
										playGame();

									}
									else { // Otherwise prompt the user to play a valid card

										prompt.setText("Please play a valid card");
									}
								}
								else { // Otherwise prompt the user that it is not his/her turn

									prompt.setText("Its not you turn");
								}
							}
						});
			}
		}
		else if (view == compCardList) { // If it is the compCardList then only display the cardBacks

			for (int i = 0; i < playerHand.getHand().size(); i++) { // Loop through the player's hand

				// Assigns the cardBack to each card in the computer's hand

				ImageView img = new ImageView(imgs.cardBack);
				pane.getChildren().add(img);
				pane.setMargin(img, new Insets(10, 10, 0, 0));
				view.add(img);
			}
		}

		// Adjusts the stage's size as necessary

		mainStage.sizeToScene();
	}

	/**
	 * Method: getImages 
	 * @param view ArrayList of ImageViews
	 * @param player Player whos hand is being drawn
	 * @param pane FlowPane of the player
	 * @param view ArrayList of ImageViews
	 * @param hand Hand of card
	 * @param pane FlowPane of the player
	 * Method Description: Pulls the images from the CardImg class to display the card images
	 */
	public void getImages(ArrayList<ImageView> view, Hand hand, FlowPane pane) {

		pane.getChildren().removeAll(view);
		view.removeAll(view);

		for (int i = 0; i < hand.getHand().size(); i++) { // Loops through hand

			// Assigns the indexed card to card

			Card card = hand.getHand().get(i);

			// Finds the image of the card to use

			ImageView img = new ImageView(imgs.findImage(card));

			// Displays the card

			pane.getChildren().add(img);
			pane.setMargin(img, new Insets(10, 10, 0, 0));
			view.add(img);

			view.get(i).addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() { // Creates a MouseClick EventHandler for each card

						@Override
						public void handle(MouseEvent arg0) {

							// Changes the suit of the card on the discardPile

							discardPile.changeSuit(card);

							// Finds the new card image for the discardPile

							discardImg.setImage(new Image(imgs.findImage(discardPile.getTopCard())));

							// Places the deck and discardPile back on the table

							table.setCenter(deckPane);

							// Sets humanHasPlayed to true and calls playGame();

							humanHasPlayed = true;
							playGame();
						}
					});

			// Adjusts the stage size if necessary

			mainStage.sizeToScene();
		}
	}

	/**
	 * Method: btnActions 
	 * @return void
	 * Method Description: Controls the actions of each button
	 */
	public void btnActions() {

		playBtn.setOnAction(new EventHandler<ActionEvent>() { // Launches setupGame

			@Override
			public void handle(ActionEvent arg0) {

				setupGame();

			}
		});

		playAgainBtn.setOnAction(new EventHandler<ActionEvent>() { // Launches setupGame

					@Override
					public void handle(ActionEvent arg0) {

						setupGame();
					}
				});

		rulesBtn.setOnAction(new EventHandler<ActionEvent>() { // Displays the game's rules

			@Override
			public void handle(ActionEvent arg0) {

				table.setTop(backBtn);
				table.setCenter(rules);
				rules.setText(gameRules.toString());
				rules.setWrapText(true);
				mainStage.setWidth(800);
			}
		});

		exitBtn.setOnAction(new EventHandler<ActionEvent>() { // Exits the application

			@Override
			public void handle(ActionEvent arg0) {

				mainStage.close();
				Platform.exit();
			}
		});

		backBtn.setOnAction(new EventHandler<ActionEvent>() { // Goes back to the main menu

			@Override
			public void handle(ActionEvent arg0) {

				table.setTop(null);
				table.setCenter(null);
				table.setCenter(btnPane);
				table.setBottom(null);
				mainStage.sizeToScene();

			}
		});

		sortBtn.setOnAction(new EventHandler<ActionEvent>() { // Sorts the player's cards

			@Override
			public void handle(ActionEvent arg0) {

				human.getPlayerHand().sortCards();
				getImages(humanCardList, human, humanImgView);
			}
		});
	}

	/**
	 * Method: cardActions 
	 * @return void
	 * Method Description: Controls the actions of each of the cards
	 */
	public void cardActions() {

		deckImg.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() { // Creates a Mouse Event for the deck

					@Override
					public void handle(MouseEvent arg0) {

						if (humanTurn && !gameRules.canPlay(human.getPlayerHand(), discardPile.getTopCard())) { // If it is the human's turn and the player cannot play the draw a card

							try {

								// Checks to see if the deck needs to be refreshed

								discardPile.refreshDeck(deck);

								// Draws a card and adds it to the human's hand

								human.drawCard(deck);

								// Redraws the human's hand

								getImages(humanCardList, human, humanImgView);
							}
							catch (InvalidCardException ice) {

								prompt.setText(ice.getMessage());
							}
							catch (Exception e) {

								prompt.setText(e.getMessage());
							}
						}
						else if (humanTurn) { // Else if it is just the human's turn prompt the user that he/she has a playable card

							prompt.setText("You have a playable card");
						}
						else { // Otherwise prompt the user that it is not his/her turn

							prompt.setText("It is not your turn");
						}
					}
				});

	}

	/**
	 * Method: start
	 * @param arg0
	 * @throws Exception
	 * Method Description: The Game UI	
	 */
	public void start(Stage arg0) throws Exception {

		// Initiate the variables of the card

		gameRules = new GameRules();

		// The main BorderPane

		table = new BorderPane();
		table.setStyle("-fx-padding:20");

		// Prompt/Error labels
		prompt = new Label("");
		compErrors = new Label("");
		rules = new TextArea();

		// The play button

		playBtn = new Button("Play");
		playBtn.setMinHeight(50);
		playBtn.setMinWidth(200);

		// The play again button

		playAgainBtn = new Button("Play Again?");
		playAgainBtn.setMinHeight(50);
		playAgainBtn.setMinWidth(200);

		// The rules button

		rulesBtn = new Button("Rules");
		rulesBtn.setMinHeight(50);
		rulesBtn.setMinWidth(200);

		// The exit button

		exitBtn = new Button("Exit");
		exitBtn.setMinHeight(50);
		exitBtn.setMinWidth(200);

		// The back button

		backBtn = new Button("Back");
		backBtn.setMinHeight(25);
		backBtn.setMinWidth(50);
		backBtn.setStyle("-fx-margin:0,0,10,0");

		// The sort button

		sortBtn = new Button("Sort Hand");
		sortBtn.setMinHeight(25);
		sortBtn.setMinWidth(50);
		sortBtn.setStyle("-fx-margin:0,10,0,0");

		btnActions();

		// Sets up the main menu with the btnPane

		btnPane = new GridPane();
		btnPane.setMaxHeight(200);
		btnPane.setMaxWidth(200);
		btnPane.setVgap(20);
		btnPane.addRow(0, playBtn);
		btnPane.addRow(1, rulesBtn);
		btnPane.addRow(2, exitBtn);
		table.setCenter(btnPane);

		// Initiate imgs based on the user's operating system

		imgs = new CardImg(System.getProperty("os.name"));

		// Initiates the scene and the stage

		scene = new Scene(table, 700, 800);
		mainStage = new Stage();
		mainStage.setScene(scene);
		mainStage.setMinWidth(700);
		mainStage.setMinHeight(500);
		mainStage.setTitle("Crazy 8's");
		mainStage.show();
	}

}
