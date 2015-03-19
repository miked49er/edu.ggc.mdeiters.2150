package edu.ggc.mdeiters.FX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**Class: ScheduleUI.java
 * @version 1.0
 * Date Written: Feb 10, 2015
 * Class Description: Java Fx Demo using a List View to display a list of courses from a schedule.
 */


public class ScheduleUI extends Application
{
	//Widget Attributes
	private BorderPane bPane;
	private Scene scene;
	private Stage stage;
	private Schedule schedule;
	private ListView<Course> listView;
	private TextArea field;

	/**
	 * Method Name: getObservableList
	 * @return observable list of courses.
	 * Method Description: Converts list of courses into an observable list for fx ui components.
	 */
	private ObservableList<Course> getObservableList()
	{
		ObservableList<Course> list = FXCollections.observableArrayList(this.schedule.getCourseList());
		return list;
	}

	/*
	 * (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage arg0) throws Exception
	{
		ScheduleTester tester = new ScheduleTester();
		this.schedule = tester.genTestData(5);
		this.listView = new ListView<Course>();
		this.listView.setItems(getObservableList());
		this.listView.autosize();
		this.bPane = new BorderPane();
		this.bPane.setCenter(this.listView);
		this.field = new TextArea(this.schedule.toString());
		this.field.setEditable(false);
		this.bPane.setTop(this.field);
		this.scene = new Scene(this.bPane);
		this.stage = new Stage();
		this.stage.setScene(scene);
		this.stage.setMinWidth(900);
		this.stage.setMinHeight(500);
		stage.setTitle("Schedule Demo");
		this.stage.show();
	}

}

