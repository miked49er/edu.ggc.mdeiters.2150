package edu.ggc.mdeiters.FX;

/**Class: CourseValidatiors.java
 * @version 1.0
 * Date Written: Feb 9, 2015
 * Class Description: Utility class to store validation rules for courses
 */

public class CourseValidator
{
	/*Class Constants and Variables*/
	//Credit Hours
	public static final int MIN_CREDIT_HOURS= 0;
	public static final int MAX_CREDIT_HOURS = 4;
	public static final int DEFAULT_CREDIT_HOURS = 3;
	public static final String CREDIT_HOURS_ERROR_MESSAGE = "Invalid value typed for Credit Hours. Defaulting to " + DEFAULT_CREDIT_HOURS;
	//CRN
	public static  int DEFAULT_CRN = 9001;
	public static final String CRN_ERROR_MESSAGE = "Invalid value typed for Course Registration Number. Defaulting to " + DEFAULT_CRN;
	//Number
	public static final int MIN_COURSE_NUMBER = 1;
	public static final int MAX_COURSE_NUMBER = 9999;
	public static final int DEFAULT_COURSE_NUMBER = 1001;
	public static final String COURSE_NUMBER_ERROR_MESSAGE = "Invalid value typed for Course Number. Defaulting to " + DEFAULT_COURSE_NUMBER;
	//Section ID
	public static final int MIN_SECTION_ID = 1;
	public static final int MAX_SECTION_ID = 80;
	public static final int DEFAULT_SECTION_ID = 1;
	public static final String SECTION_ID_ERROR_MESSAGE = "Invalid value typed for Course Section ID. Defaulting to " + DEFAULT_SECTION_ID;
	//Subject
	public static final int MAX_SUBJECT_LENGTH = 4;
	//Instructor
	public static final String DEFAULT_INSTRUCTOR = "TBA";
	//Availbility
	public static final String[] IS_AVAILBLE_VALIDATION_VALUES = {"T", "t", "y", "Y"};
	public static final boolean DEFAULT_IS_AVAILABLE = false;
	public static final String IS_AVAILBLE_ERROR_MESSAGE = "Invalid value typed for Course Availbility. Defaulting to " + DEFAULT_IS_AVAILABLE;
	
	/**
	 * Empty Constructor, used as a static utility class.
	 *
	 */
	private CourseValidator()
	{
		//empty constructor
	}
}
