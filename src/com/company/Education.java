package com.company;


import java.util.ArrayList;

public class Education
{
	public Education()
	{

	}

	public String getDegreeCompleted()
	{
		return DegreeCompleted;
	}

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

	private String DegreeCompleted;
	private String UniversityName;
	private String YearsCompleted;
	private ArrayList<Experiance>experiancelevel= new ArrayList<Experiance>();


	public ArrayList<Experiance> getExperiancelevel()
	{
		return experiancelevel;
	}

	public void setExperiancelevel(ArrayList<Experiance> experiancelevel)
	{
		this.experiancelevel = experiancelevel;
	}

	public void addExperiance(Experiance aExperiance)
	{
		experiancelevel.add(aExperiance);
	}
}




