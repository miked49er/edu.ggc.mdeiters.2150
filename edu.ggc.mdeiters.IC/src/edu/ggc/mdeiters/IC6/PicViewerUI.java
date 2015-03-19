
package edu.ggc.mdeiters.IC6;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
	private Image srcEdit;
	private Button okBtn;
	private Button exitBtn;
	private Button origBtn;
	private Button editBtn;
	private PicEditor edit;

	/**
	 * Method: getFile 
	 * @return String the URI of the image file
	 * Method Description: Allow the user to select an image file
	 */
	public String getFile() throws RuntimeException{

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

						// Enable combo, input, origBtn

						combo.setDisable(false);
						input.setDisable(false);
						origBtn.setDisable(false);

						// Prompt the user to edit the picture

						prompt.setText("Select and option to use to edit the picture");

						// Changes the okBtn text to "Ok"

						okBtn.setText("Ok");

					} catch (NullPointerException npe) { // Catches the program if the user does not select an image

						prompt.setText("Please select an image file");
					
					}
					
				} else if (combo.getValue().equals(list.get(0))) { // Invert the image

					// Inverts each pixel of src
					
					srcEdit = edit.invertColors(new Image(img));
					
					// Outputs srcEdit for the user to see
					
					srcView.setImage(srcEdit);

					if (editBtn.isDisable()) { // Enables the editBtn if it is currently disabled

						editBtn.setDisable(false);
					}

				} else if (combo.getValue().equals(list.get(1))) { // Adjust the colors of the image

					// Adjusts each pixel's Argb of src
					
					srcEdit = edit.adjustColors(src, Integer.parseInt(input.getText()));
					
					// Outputs srcEdit for the user to see
					
					srcView.setImage(srcEdit);

					if (editBtn.isDisable()) { // Enables the editBtn if it is currently disabled

						editBtn.setDisable(false);
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

				// Outputs srcEdit for the user to see
				
				srcView.setImage(srcEdit);

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

	/** Method: start
	 * @param arg0
	 * @throws Exception
	 * Method Description: TODO
	 */
	@Override
	public void start(Stage arg0) throws Exception {

		edit = new PicEditor();

		list = FXCollections.observableArrayList("Invert the Image", "Modify the Colors");

		combo = new ComboBox<String>(list);
		combo.setPromptText("Load an Image");
		combo.setEditable(false);
		combo.setDisable(true);

		bPane = new BorderPane();
		controls = new BorderPane();
		btn = new BorderPane();
		imgBtn = new GridPane();

		prompt = new Label("");
		input = new TextField("");
		input.setDisable(true);

		srcView = new ImageView();

		origBtn = new Button("Original");
		origBtn.setMinHeight(30);
		origBtn.setMinWidth(30);
		origBtn.setDisable(true);
		editBtn = new Button("Edited");
		editBtn.setMinHeight(30);
		editBtn.setMinWidth(30);
		editBtn.setDisable(true);

		imgBtn.setHgap(10);
		imgBtn.addRow(0, origBtn);
		imgBtn.addRow(0, editBtn);

		okBtn = new Button("Load Image");
		okBtn.setMinHeight(30);
		okBtn.setMinWidth(30);
		exitBtn = new Button("Exit");
		exitBtn.setMinHeight(30);
		exitBtn.setMinWidth(30);
		btnActions();

		controls.setLeft(combo);
		controls.setCenter(prompt);
		controls.setRight(input);

		btn.setCenter(okBtn);
		btn.setRight(exitBtn);
		btn.setLeft(imgBtn);

		bPane.setTop(controls);
		bPane.setCenter(srcView);
		bPane.setBottom(btn);

		scene = new Scene(bPane, 800, 600);
		mainStage = new Stage();
		mainStage.setScene(scene);
		mainStage.setMinHeight(600);
		mainStage.setMinWidth(800);
		mainStage.setTitle("Picture Viewer");
		mainStage.show();

	}

}
