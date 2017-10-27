package com.company;

import java.util.ArrayList;

public class Experiance
{
	Skills skill;

	public Skills getSkill()
	{
		return skill;
	}

	public void setSkill(Skills skill)
	{
		this.skill = skill;
	}


	private ArrayList<Skills>skillstype= new ArrayList<Skills>();       //ARRAYLIST FOR SKILLS
	private String JobTittle;
	private String CompanyName;
	private String YearsWorked;
	private String Duty;

	public ArrayList<Skills> getSkillstype()        //GETTER&SETTER
	{
		return skillstype;
	}

	public void setSkillstype(ArrayList<Skills> skillstype)
	{
		this.skillstype = skillstype;
	}

	public String getJobTittle()
	{
		return JobTittle;
	}

	public void setJobTittle(String jobTittle)
	{
		JobTittle = jobTittle;
	}

	public String getCompanyName()
	{
		return CompanyName;
	}

	public void setCompanyName(String companyName)
	{
		CompanyName = companyName;
	}

	public String getYearsWorked()
	{
		return YearsWorked;
	}

	public void setYearsWorked(String yearsWorked)
	{
		YearsWorked = yearsWorked;
	}


	public String getDuty2()
	{
		return Duty2;
	}

	public void setDuty2(String duty2)
	{
		Duty2 = duty2;
	}

	private String Duty2;

	public String getDuty()
	{
		return Duty;
	}

	public void setDuty(String duty)
	{
		Duty = duty;
	}

	public void addSkills(Skills aSkills)                       //ADDED SKILLS INTO EXPERIANCE
	{
		skillstype.add(aSkills);
	}

}
