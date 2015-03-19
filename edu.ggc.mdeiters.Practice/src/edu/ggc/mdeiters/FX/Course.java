package edu.ggc.mdeiters.FX;

/**Class: Course.java
 * @author: Matthew Berger
 * @version 1.0
 * Date Written: Feb 4, 2015
 * Class Description: Business Class four Course. A course consists of a course registration
 *  number, subject, course number, section number, instructor, credit hour amount, and availbility.
 * 
 */
public class Course
{
	//Instance Attributes
	private int crn;
	private String subject;
	private int number;
	private int sectionId;
	private int creditHours;
	private String instructor;
	private boolean isAvailable;

	/**
	 * Constructor for default course. 
	 * Handles bad data through validation tests. 
	 * @param crn
	 * @param subject
	 * @param number
	 * @param sectionID
	 */
	public Course(int crn, String subject, int number, int sectionID)
	{
		CourseValidator.DEFAULT_CRN++;
		this.setCrn(crn);
		this.setSubject(subject);
		this.setNumber(number);
		this.setSectionId(sectionID);
		this.creditHours = CourseValidator.DEFAULT_CREDIT_HOURS;
		this.instructor = CourseValidator.DEFAULT_INSTRUCTOR;
		this.isAvailable = CourseValidator.DEFAULT_IS_AVAILABLE;
	}

	/**
	 * Constructor for UI components, pass in all String values. 
	 * Handles bad data through validation tests. 
	 * @param crn
	 * @param subject
	 * @param number
	 * @param sectionId
	 * @param creditHours
	 * @param instructor
	 * @param isAvailable
	 */
	public Course(String crn, String subject, String number, String sectionId,
			String creditHours, String instructor, String isAvailable)
	{
		CourseValidator.DEFAULT_CRN++;
		this.setCrn(crn);
		this.setSubject(subject);
		this.setNumber(number);
		this.setSectionId(sectionId);
		this.setCreditHours(creditHours);
		this.setInstructor(instructor);
		this.setAvailable(isAvailable);
	}

	/**Method Name: getCrn
	 * @return the crn
	 */
	public int getCrn()
	{
		return crn;
	}

	/**Method Name: setCrn
	 * @param crn the crn to set
	 */
	public void setCrn(int crn)
	{
		this.crn = crn;
	}

	/**Method Name: setCrn
	 * @param crn the crn to set
	 */
	public void setCrn(String crn)
	{
		try
		{
			this.setCrn(Integer.parseInt(crn));
		}
		catch(NumberFormatException nfe)
		{
			this.crn = CourseValidator.DEFAULT_CRN;
			System.out.println(CourseValidator.CRN_ERROR_MESSAGE);
		}
	}

	/**Method Name: getSubject
	 * @return the subject
	 */
	public String getSubject()
	{
		return subject;
	}

	/**Method Name: setSubject
	 * @param subject the subject to set
	 */
	public void setSubject(String subject)
	{
		if(subject.length() > CourseValidator.MAX_SUBJECT_LENGTH)
		{
			this.subject = subject.substring(0, CourseValidator.MAX_SUBJECT_LENGTH);
		}
		else
		{
			this.subject = subject;
		}

	}

	/**Method Name: getNumber
	 * @return the number
	 */
	public int getNumber()
	{
		return number;
	}

	/**Method Name: setNumber
	 * @param number the number to set
	 */
	public void setNumber(int number)
	{
		if (number < CourseValidator.MIN_COURSE_NUMBER || number > CourseValidator.MAX_COURSE_NUMBER)
		{
			this.number = CourseValidator.DEFAULT_COURSE_NUMBER;
			System.out.println(CourseValidator.COURSE_NUMBER_ERROR_MESSAGE);
		}
		else
		{
			this.number = number;
		}
	}

	/**Method Name: setNumber
	 * @param number the number to set
	 */
	public void setNumber(String number)
	{
		try
		{
			this.setNumber(Integer.parseInt(number));
		}
		catch(NumberFormatException nfe)
		{
			this.number = CourseValidator.DEFAULT_COURSE_NUMBER;
			System.out.println(CourseValidator.COURSE_NUMBER_ERROR_MESSAGE);
		}
	}

	/**Method Name: getSectionId
	 * @return the sectionId
	 */
	public int getSectionId()
	{
		return sectionId;
	}

	/**Method Name: setSectionId
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(int sectionId)
	{
		if (sectionId < CourseValidator.MIN_SECTION_ID || sectionId > CourseValidator.MAX_SECTION_ID)
		{
			this.sectionId = sectionId;
		}
		else
		{
			this.sectionId = sectionId;
		}
	}

	/**Method Name: setSectionId
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(String sectionId)
	{
		try
		{
			this.setSectionId(Integer.parseInt(sectionId));
		}
		catch(NumberFormatException nfe)
		{
			this.sectionId = CourseValidator.DEFAULT_SECTION_ID;
			System.out.println(CourseValidator.SECTION_ID_ERROR_MESSAGE);
		}
	}

	/**Method Name: getCreditHours
	 * @return the creditHours
	 */
	public int getCreditHours()
	{
		return creditHours;
	}

	/**Method Name: setCreditHours
	 * @param creditHours the creditHours to set
	 */
	public void setCreditHours(int creditHours)
	{
		if (creditHours < CourseValidator.MIN_CREDIT_HOURS || creditHours > CourseValidator.MAX_CREDIT_HOURS)
		{
			this.creditHours = CourseValidator.DEFAULT_CREDIT_HOURS;
			System.out.println(CourseValidator.CREDIT_HOURS_ERROR_MESSAGE);
		}
		else
		{
			this.creditHours = creditHours;
		}
	}

	/**Method Name: setCreditHours
	 * @param creditHours the creditHours to set
	 */
	public void setCreditHours(String creditHours)
	{
		try
		{
			this.setCreditHours(Integer.parseInt(creditHours));
		}
		catch(NumberFormatException nfe)
		{
			this.creditHours = CourseValidator.DEFAULT_CREDIT_HOURS;
			System.out.println(CourseValidator.CREDIT_HOURS_ERROR_MESSAGE);
		}
	}

	/**Method Name: getInstructor
	 * @return the instructor
	 */
	public String getInstructor()
	{
		return instructor;
	}

	/**Method Name: setInstructor
	 * @param instructor the instructor to set
	 */
	public void setInstructor(String instructor)
	{
		if (instructor.isEmpty())
		{
			this.instructor = CourseValidator.DEFAULT_INSTRUCTOR;
		}
		else
		{
			this.instructor = instructor;
		}
	}

	/**Method Name: isAvailable
	 * @return the isAvailable
	 */
	public boolean isAvailable()
	{
		return isAvailable;
	}

	/**Method Name: setAvailable
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}

	/**Method Name: setAvailable
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(String isAvailable)
	{
		boolean notValid = true;
		for (int index = 0; index < CourseValidator.IS_AVAILBLE_VALIDATION_VALUES.length && notValid; index++)
		{
			if (isAvailable.startsWith(CourseValidator.IS_AVAILBLE_VALIDATION_VALUES[index]))
			{
				this.isAvailable = true;
			}
		}
		if (!notValid)
		{
			this.isAvailable = false;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "[Course] crn => " + crn + " | subject => " + subject
				+ " | number => " + number + " | sectionId => " + sectionId
				+ " | creditHours => " + creditHours + " | instructor => "
				+ instructor + " | isAvailable => " + isAvailable;
	}



}
