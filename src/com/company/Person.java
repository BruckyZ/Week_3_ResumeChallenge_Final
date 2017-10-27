package com.company;

import java.util.ArrayList;

public class Person
{

	Education education;
	Experiance experiance;

	ArrayList<Experiance> experiancelevel = new ArrayList<Experiance>();
	ArrayList<Education> educationlevel = new ArrayList<Education>();

	public ArrayList<Experiance> getExperiancelevel()
	{
		return experiancelevel;
	}

	public void setExperiancelevel(ArrayList<Experiance> experiancelevel)
	{
		this.experiancelevel = experiancelevel;
	}

	public Experiance getExperiance()
	{
		return experiance;
	}

	public void setExperiance(Experiance experiance)
	{
		this.experiance = experiance;
	}

	public ArrayList<Education> getEducationlevel()
	{
		return educationlevel;
	}

	public void setEducationlevel(ArrayList<Education> educationlevel)
	{
		this.educationlevel = educationlevel;
	}


	public Education getEducation()
	{
		return education;
	}

	public void setEducation(Education education)
	{
		this.education = education;
	}


	public void addEducation(Education aEducation)
	{
		educationlevel.add(aEducation);
	}

	public void addExperiance(Experiance aExperiance)
	{
		experiancelevel.add(aExperiance);
	}


}
