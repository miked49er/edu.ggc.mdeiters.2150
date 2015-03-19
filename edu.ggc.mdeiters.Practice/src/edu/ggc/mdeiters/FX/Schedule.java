package edu.ggc.mdeiters.FX;

import java.util.ArrayList;

/**Class: Schedule.java
 * @version 1.0
 * Date Written: Feb 10, 2015
 * Class Description: TODO
 */

public class Schedule 
{
	private ArrayList<Course> courseList;
	
	/**
	 * Constructor
	 *
	 */
	public Schedule()
	{
		this.courseList = new ArrayList<Course>();
	}

	/**Method Name: getCourseList
	 * @return the courseList
	 */
	public ArrayList<Course> getCourseList()
	{
		return courseList;
	}

	/**Method Name: setCourseList
	 * @param courseList the courseList to set
	 */
	public void setCourseList(ArrayList<Course> courseList)
	{
		this.courseList = courseList;
	}
	
	/**
	 * Method Name: getAllCreditHours
	 * @return
	 * Method Description: TODO
	 */
	public int getAllCreditHours()
	{
		int sum = 0;
		for (Course element: this.courseList)
		{
			sum += element.getCreditHours();
		}
		return sum;
	}
	
	/**
	 * Method Name: getAllAvaibleCourses
	 * @return
	 * Method Description: TODO
	 */
	public int getAllAvaibleCourses()
	{
		int sum = 0;
		for (Course element: this.courseList)
		{
			if (element.isAvailable())
			{
				sum++;
			}
		}
		return sum;
	}
	
	/**
	 * Method Name: howManyBySubject
	 * @param subject
	 * @return
	 * Method Description: TODO
	 */
	public int howManyBySubject(String subject)
	{
		int sum = 0;
		for (Course element: this.courseList)
		{
			if (element.getSubject().equalsIgnoreCase(subject))
			{
				sum++;
			}
		}
		return sum;
	}
	
	/**
	 * Method Name: addCourse
	 * @param course
	 * Method Description: TODO
	 */
	public void addCourse(Course course)
	{
		this.courseList.add(course);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "[Schedule] getAllCreditHours() => " + getAllCreditHours()
				+ " | getAllAvaibleCourses() => " + getAllAvaibleCourses();
	}

	
	
	
}
