
package edu.ggc.mdeiters.IC5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Class: Calculator
 * @author Mike Deiters
 * @version 1.0
 * ITEC 2150 Spring 2015
 * Written: Mar 7, 2015
 * 
 * Class Description: 4 function calculator in FX
 * 
 * Purpose: Use java FX to create a functional 4 function calculator
 *
 */
public class Calculator extends Application {

	private TextField numberField;
	private Label errorField;

	private Button one;
	private Button two;
	private Button three;
	private Button four;
	private Button five;
	private Button six;
	private Button seven;
	private Button eight;
	private Button nine;
	private Button zero;
	private Button point;
	private Button clear;
	private GridPane numberButtons;

	private Button equal;
	private Button plus;
	private Button minus;
	private Button multiply;
	private Button divide;
	private GridPane operationButtons;

	private double firstNum = 0;
	private double secondNum = 0;
	private char operation;
	private boolean hasPressedEqual = false;

	/**
	 * Method: start 
	 * @param mainStage
	 * @throws Exception
	 * Method Description: Creates the FX interface window
	 */
	public void start(Stage mainStage) throws Exception {

		// Creates the textField to interact with the calculator

		numberField = new TextField("");

		// Create a label to use as an error output 

		errorField = new Label("");

		// Creates a borderPane to place the buttons in the stage

		BorderPane border = new BorderPane();
		buildNumbers();
		buildOperations();

		/* Places the numberField on the top of the stage
		 * Places the errorField on the bottom of the stage
		 * Places the numberButtons gridPane on the left side of the stage
		 * Places the operationButtons gridPane on the right side of the stage
		 */

		border.setTop(numberField);
		border.setBottom(errorField);
		border.setLeft(numberButtons);
		border.setRight(operationButtons);

		// Create the scene

		Scene scene = new Scene(border, 200, 200);
		mainStage.setTitle("Calculator");
		mainStage.setScene(scene);
		mainStage.show();
	}

	/**
	 * Method: buildNumbers 
	 * @return void
	 * Method Description: Creates all of the number, the decimal, and clear buttons
	 */
	private void buildNumbers() {

		// Creates the numberButtons gridPane and sets the margins between the buttons

		numberButtons = new GridPane();
		numberButtons.setVgap(5);
		numberButtons.setHgap(5);

		// The number 1 button

		one = new Button("1");
		one.setMinWidth(30);
		one.setMinHeight(30);
		one.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "1" into the numberField

				numberField.setText(numberField.getText() + "1");
			}
		});

		// The number 2 buttons
		two = new Button("2");
		two.setMinWidth(30);
		two.setMinHeight(30);
		two.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "2" into the numberField

				numberField.setText(numberField.getText() + "2");
			}
		});

		// The number 3 button

		three = new Button("3");
		three.setMinWidth(30);
		three.setMinHeight(30);
		three.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "3" into the numberField

				numberField.setText(numberField.getText() + "3");
			}
		});

		// The number 4 button

		four = new Button("4");
		four.setMinWidth(30);
		four.setMinHeight(30);
		four.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "4" into the numberField

				numberField.setText(numberField.getText() + "4");
			}
		});

		// The number 5 button

		five = new Button("5");
		five.setMinWidth(30);
		five.setMinHeight(30);
		five.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "5" into the numberField

				numberField.setText(numberField.getText() + "5");
			}
		});

		// The number 6 button

		six = new Button("6");
		six.setMinWidth(30);
		six.setMinHeight(30);
		six.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "6" into the numberField

				numberField.setText(numberField.getText() + "6");
			}
		});

		// The number 7 button

		seven = new Button("7");
		seven.setMinWidth(30);
		seven.setMinHeight(30);
		seven.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "7" into the numberField

				numberField.setText(numberField.getText() + "7");
			}
		});

		// The number 8 button

		eight = new Button("8");
		eight.setMinWidth(30);
		eight.setMinHeight(30);
		eight.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "8" into the numberField

				numberField.setText(numberField.getText() + "8");
			}
		});

		// The number 9 button

		nine = new Button("9");
		nine.setMinWidth(30);
		nine.setMinHeight(30);
		nine.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "9" into the numberField

				numberField.setText(numberField.getText() + "9");
			}
		});

		// The number 0 button

		zero = new Button("0");
		zero.setMinWidth(30);
		zero.setMinHeight(30);
		zero.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				// enters a "0" into the numberField

				numberField.setText(numberField.getText() + "0");
			}
		});

		// The decimal button

		point = new Button(".");
		point.setMinWidth(30);
		point.setMinHeight(30);
		point.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				clearNumberField();

				if (numberField.getText().isEmpty()) { // If the numberField is empty then it enters "0." into the numberField

					numberField.setText(numberField.getText() + "0.");

				} else { // Otherwise it just enters "." into the numberField

					numberField.setText(numberField.getText() + ".");
				}
			}
		});

		// The clear button

		clear = new Button("C");
		clear.setMinWidth(30);
		clear.setMinHeight(30);
		clear.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				// Clears the numberField

				numberField.setText("");
			}
		});

		// Builds the number button panel

		numberButtons.addRow(0, seven);
		numberButtons.addRow(0, eight);
		numberButtons.addRow(0, nine);

		numberButtons.addRow(1, four);
		numberButtons.addRow(1, five);
		numberButtons.addRow(1, six);

		numberButtons.addRow(2, one);
		numberButtons.addRow(2, two);
		numberButtons.addRow(2, three);

		numberButtons.addRow(3, zero);
		numberButtons.addRow(3, point);
		numberButtons.addRow(3, clear);
	}

	/**
	 * Method: buildOperations 
	 * @return void
	 * Method Description: Creates the operation buttons
	 */
	private void buildOperations() {

		// Creates the operationButtons gridPane and sets the margins between the buttons

		operationButtons = new GridPane();
		operationButtons.setVgap(5);
		operationButtons.setHgap(5);

		// The total button

		equal = new Button("=");
		equal.setMinWidth(30);
		equal.setMinHeight(30);
		equal.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				try {

					// Tries to parseDouble the numberField to the double secondNum

					secondNum = Double.parseDouble(numberField.getText());

					// Tests to see what operation the user wants to use

					if (operation == '+') {

						numberField.setText("" + (firstNum + secondNum));

					} else if (operation == '-') {

						numberField.setText("" + (firstNum - secondNum));

					} else if (operation == '*') {

						numberField.setText("" + (firstNum * secondNum));

					} else if (operation == '/') {

						if (secondNum != 0) { // If secondNum isn't 0 then it will divide the two numbers

							numberField.setText("" + (firstNum / secondNum));

						} else { // Otherwise the calculator will send an error to the errorField

							errorField.setText("Cannot divide by 0");
						}

					} else { // If there is no operation then just displays the secondNum

						numberField.setText("" + secondNum);
					}
				} catch (NumberFormatException nfe) { // Catches the error of having an input other than a number in nubmerField

					errorField.setText(" " + "Invalid input of: " + numberField.getText());
				}

				// Changes hasPressEqual to true to indicate that the user had pressed equal

				hasPressedEqual = true;
			}
		});

		// The addition button

		plus = new Button("+");
		plus.setMinWidth(30);
		plus.setMinHeight(30);
		plus.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				setFirstNum();

				// Set operation to "+"

				operation = '+';
			}
		});

		// The subtract button

		minus = new Button("-");
		minus.setMinWidth(30);
		minus.setMinHeight(30);
		minus.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				setFirstNum();

				// Set the operation to "-"

				operation = '-';
			}
		});

		// The multiplication button

		multiply = new Button("*");
		multiply.setMinWidth(30);
		multiply.setMinHeight(30);
		multiply.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				setFirstNum();

				// Sets the operation to "*"

				operation = '*';
			}
		});

		// The division button

		divide = new Button("/");
		divide.setMinWidth(30);
		divide.setMinHeight(30);
		divide.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				setFirstNum();

				// Sets the operation to "/"

				operation = '/';
			}
		});

		// Builds the operation buttons

		operationButtons.add(divide, 1, 0);
		operationButtons.add(multiply, 1, 1);
		operationButtons.add(minus, 1, 2);
		operationButtons.add(plus, 1, 3);
		operationButtons.add(equal, 0, 3);
	}

	/**
	 * Method: setFirstNum 
	 * @return void
	 * Method Description: Tries to parseDouble the numberField to the double firstNum
	 */
	public void setFirstNum() {

		try {

			firstNum = Double.parseDouble(numberField.getText());

		} catch (NumberFormatException nfe) { // Catches the NumberFormatError when the user enters something other than a double

			errorField.setText(" " + "Invalid input of: " + numberField.getText());
		}

		// Clears the numberField

		numberField.setText("");
	}

	/**
	 * Method: clearNumberField 
	 * @return void
	 * Method Description: Checks to see if the equals button has been pressed
	 */
	public void clearNumberField() {

		if (hasPressedEqual) { // If hasPressedEqual is true then clear the numberField and sets hasPressedEqual to be false

			numberField.requestFocus();
			numberField.setText("");
			hasPressedEqual = false;
		}
	}

	/**
	 * Method: main 
	 * @param args
	 * Method Description: Launches the program for JavaFX
	 */
	public static void main(String[] args) {

		Application.launch(args);
	}

}
