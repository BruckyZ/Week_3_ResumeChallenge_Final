package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class Main
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        Experiance experiance;
        String name;
        String emailAddress;
        String Add;

        int educationCountBeg = 1;                  //One Option
        int educationCountEnd =10;                  //Another Option
        int experianceCount = 0;
        int skillCount=1;
        int count;
        Person person= new Person();
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your email_address: ");
        emailAddress = scan.nextLine();

        do
        {
            Education education = new Education();
            System.out.println("Enter your Degree in: ");
            education.setDegreeCompleted(scan.nextLine());
            System.out.println("Enter the University:");
            education.setUniversityName(scan.nextLine());
            System.out.println("Enter the Year Completed:");
            education.setYearsCompleted(scan.nextLine());
            System.out.println("Do you want to add more Educational Achivement Yes/No?:");
            Add = scan.nextLine();
            person.addEducation(education);
            educationCountBeg++;
            count= (educationCountEnd-educationCountBeg);
            System.out.println("Number of Enteries left for you to add : "+ count);
        }
        //while (Add.equalsIgnoreCase("Yes") && educationCount <= 10);                         //Another Option just to loop until it reachs the max no without notifying users
        while (Add.equalsIgnoreCase("Yes")&& educationCountBeg<educationCountEnd);          //One option to Give users No of enteries left to add.

        do
        {
            experiance = new Experiance();
            System.out.println("Enter your JobTittle: ");
            experiance.setJobTittle(scan.nextLine());
            System.out.println("Enter the CompanyName:");
            experiance.setCompanyName(scan.nextLine());
            System.out.println("Enter the Years Worked:");
            experiance.setYearsWorked(scan.nextLine());
            do
            {

                System.out.println("Enter you Duties");
                experiance.setDuty(scan.nextLine());
                System.out.println("Enter another Duties");
                experiance.setDuty2(scan.nextLine());
                System.out.println("Do you want to add another duties Yes/No?:");
                Add = scan.nextLine();

            }
            while (Add.equalsIgnoreCase("Yes"));

            System.out.println("Do you want to add more Experiance Yes/No?:");
            Add = scan.nextLine();
            person.addExperiance(experiance);
            experianceCount++;

        }
        while (Add.equalsIgnoreCase("Yes")&& experianceCount <= 10);



        do
        {
            Skills skill = new Skills();
            System.out.println("Enter your Skills: ");
            skill.setSkilledType(scan.nextLine());
            System.out.println("Enter your Proffesional_Level  :");
            skill.setProffesional_Level(scan.nextLine());
            System.out.println("Do you want to add more Skills Yes/No?:");
            Add = scan.nextLine();
            experiance.addSkills(skill);
            skillCount++;

        }
        while (Add.equalsIgnoreCase("Yes")&&skillCount<=20);



        System.out.println("============================================================== ");
        System.out.println(name);
        System.out.println(emailAddress);
        System.out.println("                 ");
        System.out.println("Education");



        for (Education educationlevels : person.getEducationlevel())
        {
            System.out.println(educationlevels.getDegreeCompleted() + ",");
            System.out.println(educationlevels.getUniversityName() + "," + educationlevels.getYearsCompleted());
            System.out.println("                 ");
        }
        System.out.println("Experiences");
        for (Experiance experiancelevels : person.getExperiancelevel())
        {

            System.out.println(experiancelevels.getJobTittle());
            System.out.println(experiancelevels.getCompanyName() + "," + experiancelevels.getYearsWorked());

            System.out.println("  -Duty 1," + experiancelevels.getDuty());
            System.out.println("  -Duty 2," + experiancelevels.getDuty2());
            System.out.println("                 ");

        }
        System.out.println("Skills");
        for (Skills skillstypes : experiance.getSkillstype())

        {
            System.out.println(skillstypes.getSkilledType() + "," + skillstypes.getProffesional_Level());
        }
    }
}


