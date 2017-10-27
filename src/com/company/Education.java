package com.company;


import java.util.ArrayList;

public class Education
{
	public Education()                  //CONSTRUCTOR
	{

	}

	private String DegreeCompleted;
	private String UniversityName;
	private String YearsCompleted;



	public String getDegreeCompleted()
	{
		return DegreeCompleted;
	}                   //GETTER&SETTER

	public void setDegreeCompleted(String degreeCompleted)
	{
		DegreeCompleted = degreeCompleted;
	}

	public String getUniversityName()
	{
		return UniversityName;
	}

	public void setUniversityName(String universityName)
	{
		UniversityName = universityName;
	}

	public String getYearsCompleted()
	{
		return YearsCompleted;
	}

	public void setYearsCompleted(String yearsCompleted)
	{
		YearsCompleted = yearsCompleted;
	}



}




