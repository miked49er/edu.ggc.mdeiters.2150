package edu.ggc.mdeiters.FX;

import java.util.ArrayList;

import javafx.application.Application;

/**Class: ScheduleTester.java
 * @version 1.0
 * Date Written: Feb 10, 2015
 * Class Description: Tester class that gens test data as courses and places them into a schedule.
 */

class ScheduleTester
{
	/**
	 * Method Name: genTestData
	 * @param Amount of test data in the schedule, 1 is a set of 3, 2 is a set of 6........
	 * @return schedule of generated courses
	 * Method Description: Generates test data as courses and places them into a schedule.
	 */
	public Schedule genTestData(int amount)
	{
		Schedule schedule = new Schedule();
		if (amount < 0) amount = 10;
		for (int index = 0; index < amount; index++)
		{
			schedule.addCourse( new Course("234", "ITEC", "5644", "345", "4", "Matt The Wizard", "true"));
			schedule.addCourse( new Course(3422, "CHEM", 10, 4));
			schedule.addCourse( new Course("", "", "", "", "", "", ""));
		}
		//System.out.println(schedule.getCourseList());
		return schedule;
	}

	/**Method Name: main
	 * @param args
	 * Method Description: Launch UI class for a demo of test data
	 */
	public static void main(String[] args)
	{
		Application.launch(ScheduleUI.class);
	}

}
