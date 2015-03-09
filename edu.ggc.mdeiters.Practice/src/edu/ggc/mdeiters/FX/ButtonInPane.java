
package edu.ggc.mdeiters.FX;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/** Class: ButtonInPane
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 5, 2015
 * 
 * Class Description: TODO
 * 
 * Purpose: TODO
 * 
 */
public class ButtonInPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		StackPane pane = new StackPane();
		Button okBtn = new Button("Come at me Bro");
		okBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				primaryStage.close();
				Platform.exit();
			}
		});
		
		pane.getChildren().add(okBtn);
		
		Scene scene = new Scene(pane, 200, 100);
		primaryStage.setTitle("Button in a pane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/** Method: main 
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args) {

		Application.launch(args);
	}

}
