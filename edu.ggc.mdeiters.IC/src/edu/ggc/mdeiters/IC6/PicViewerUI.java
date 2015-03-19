
package edu.ggc.mdeiters.IC6;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/** Class: PicViewerUI
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 17, 2015
 * 
 * Class Description: The UI of the image editor
 * 
 * Purpose: Select an image and edit it
 * 
 */
public class PicViewerUI extends Application {

	private ObservableList<String> list;
	private BorderPane bPane;
	private BorderPane controls;
	private BorderPane btn;
	private GridPane imgBtn;
	private Scene scene;
	private Stage mainStage;
	private ComboBox<String> combo;
	private Label prompt;
	private TextField input;
	private ImageView srcView;
	private String img;
	private Image src;
	private Image srcTemp;
	private Image srcCur;
	private Button okBtn;
	private Button exitBtn;
	private Button origBtn;
	private Button editBtn;
	private Button undoBtn;
	private PicEditor edit;

	/**
	 * Method: getFile 
	 * @return String the URI of the image file
	 * Method Description: Allow the user to select an image file
	 */
	public String getFile() throws RuntimeException {

		FileChooser chooser = new FileChooser();
		return chooser.showOpenDialog(mainStage).toURI().toString();
	}

	/**
	 * Method: btnActions 
	 * @return void
	 * Method Description: Create all of the buttons actions
	 */
	public void btnActions() {

		okBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				if (combo.isDisabled()) { // Default value of combo, needs to load an image

					try {

						// Assigns the URI from getFile() to img

						img = getFile();

						// Creates the original image from img

						src = new Image(img);

						// Outputs src for the user to see

						srcView.setImage(src);

						// Adjusts the stage dimensions to accommodate src

						mainStage.setMinHeight(src.getHeight() + controls.getHeight() + btn.getHeight() + 30);
						mainStage.setMinWidth(src.getWidth());

						// Enable combo, origBtn

						combo.setDisable(false);
						origBtn.setDisable(false);

						// Prompt the user to edit the picture

						prompt.setText("Select and option to use to edit the picture");

						// Changes the okBtn text to "Ok"

						okBtn.setText("Adjust");

					} catch (NullPointerException npe) { // Catches the program if the user does not select an image

						prompt.setText("Please select an image file");

					}

				} else if (combo.getValue().equals(list.get(0))) { // Invert the image

					// Assigns the currently display to srcTemp

					srcTemp = srcView.getImage();

					// Inverts each pixel of the image in srcView

					srcCur = edit.invertColors(srcTemp);

					// Outputs srcCur for the user to see

					srcView.setImage(srcCur);

					if (editBtn.isDisable()) { // Enables the editBtn if it is currently disabled

						editBtn.setDisable(false);
					}

					if (undoBtn.isDisable()) { // Enables the undoBtn if it is currently disabled

						undoBtn.setDisable(false);
					}

				} else if (combo.getValue().equals(list.get(1))) { // Adjust the colors of the image

					// Assigns the currently display to srcTemp

					srcTemp = srcView.getImage();

					try {
						// Adjusts each pixel's Argb of the image in srcView

						srcCur = edit.adjustColors(srcTemp, Integer.parseInt(input.getText()));

						// Outputs srcCur for the user to see

						srcView.setImage(srcCur);

						if (editBtn.isDisable()) { // Enables the editBtn if it is currently disabled

							editBtn.setDisable(false);
						}

						if (undoBtn.isDisable()) { // Enables the undoBtn if it is currently disabled

							undoBtn.setDisable(false);
						}

					} catch (NumberFormatException nfe) {

						prompt.setText("Please enter a number");
					}
				}
			}
		});

		// Shows the user the original image

		origBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				// Outputs src for the user to see

				srcView.setImage(src);

			}
		});

		// Shows the user the last edit they performed

		editBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				// Outputs srcCur for the user to see

				srcView.setImage(srcCur);

				if (undoBtn.isDisable()) { // Enables the undoBtn if it is currently disabled

					undoBtn.setDisable(false);
				}

			}
		});

		undoBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				// Displays the srcTemp

				srcView.setImage(srcTemp);

				// Disables undoBtn

				undoBtn.setDisable(true);

			}
		});

		// Exits the program

		exitBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				mainStage.close();
				Platform.exit();
			}
		});

	}

	/**
	 * Method: comboActions 
	 * @return void
	 * Method Description: Create actions for each element of the combobox
	 */
	public void comboActions() {

		combo.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				if (combo.getValue().equals(list.get(0))) { // Invert the image

					// Assigns the currently display to srcTemp

					srcTemp = srcView.getImage();

					// Inverts each pixel of the image in srcView

					srcCur = edit.invertColors(srcTemp);

					// Outputs srcCur for the user to see

					srcView.setImage(srcCur);

					if (editBtn.isDisable()) { // Enables the editBtn if it is currently disabled

						editBtn.setDisable(false);
					}

					if (undoBtn.isDisable()) { // Enables the undoBtn if it is currently disabled

						undoBtn.setDisable(false);
					}

					if (!input.isDisable()) {

						input.setDisable(true);
					}

				} else if (combo.getValue().equals(list.get(1))) { // Enables the input TextField

					// Assigns the currently display to srcTemp

					srcTemp = srcView.getImage();

					// Shows the original image

					srcView.setImage(srcTemp);

					if (input.isDisable()) { // Enables the input TextField

						input.setDisable(false);
					}

					if (editBtn.isDisable()) { // Enables the editBtn if it is currently disabled

						editBtn.setDisable(false);
					}
				}
			}
		});

	}

	/** Method: start
	 * @param mainStage
	 * @throws Exception
	 * Method Description: Sets up the UI
	 */
	@Override
	public void start(Stage arg0) throws Exception {

		edit = new PicEditor();

		// Creates an observable list for the combobox

		list = FXCollections.observableArrayList("Invert the Image", "Modify the Colors");

		// Creating a combobox that is disabled by default

		combo = new ComboBox<String>(list);
		combo.setPromptText("Load an Image");
		combo.setEditable(false);
		combo.setDisable(true);
		comboActions();

		bPane = new BorderPane();
		controls = new BorderPane();
		btn = new BorderPane();
		imgBtn = new GridPane();

		// Creates the prompt for the user

		prompt = new Label("");

		// Creates the input field to modify the colors with later

		input = new TextField("");
		input.setDisable(true);

		srcView = new ImageView();

		// Defining the origBtn, editBtn, and the undoBtn

		origBtn = new Button("Original");
		origBtn.setMinHeight(30);
		origBtn.setMinWidth(30);
		origBtn.setDisable(true);
		editBtn = new Button("Edited");
		editBtn.setMinHeight(30);
		editBtn.setMinWidth(30);
		editBtn.setDisable(true);
		undoBtn = new Button("Undo");
		undoBtn.setMinHeight(30);
		undoBtn.setMinWidth(30);
		undoBtn.setDisable(true);

		// Adding them to the imgBtn gridpane

		imgBtn.setHgap(10);
		imgBtn.addRow(0, origBtn);
		imgBtn.addRow(0, editBtn);
		imgBtn.addRow(0, undoBtn);

		// Defines the okBtn and the exitBtn

		okBtn = new Button("Load Image");
		okBtn.setMinHeight(30);
		okBtn.setMinWidth(30);
		exitBtn = new Button("Exit");
		exitBtn.setMinHeight(30);
		exitBtn.setMinWidth(30);
		btnActions();

		// Sets the location of prompt, combo, and input

		controls.setLeft(combo);
		controls.setCenter(prompt);
		controls.setRight(input);

		// Sets the location of the btns

		btn.setCenter(okBtn);
		btn.setRight(exitBtn);
		btn.setLeft(imgBtn);

		// Sets the location of controls, btn, and srcView

		bPane.setTop(controls);
		bPane.setCenter(srcView);
		bPane.setBottom(btn);

		// Creating the stage

		scene = new Scene(bPane, 800, 600);
		mainStage = new Stage();
		mainStage.setScene(scene);
		mainStage.setMinHeight(600);
		mainStage.setMinWidth(800);
		mainStage.setTitle("Picture Viewer");
		mainStage.show();

	}

}
