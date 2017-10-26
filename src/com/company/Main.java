package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class Main
{

    public static void main(String[] args)
    {

        ArrayList<Education> educationlevel = new ArrayList<Education>();
        ArrayList<Experiance> experiancelevel = new ArrayList<Experiance>();
        //ArrayList<Skills> skillstype = new ArrayList<Skills>();
        Scanner scan = new Scanner(System.in);

        String name;
        String email_address;
        String Period;
        String Company;
        String experiences;
        String skills;
        String Add;

        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your email_address: ");
        email_address = scan.nextLine();

        Education education = new Education();
        Experiance experiance = new Experiance();
        Skills skill = new Skills();

        do
        {

            System.out.println("Enter your Degree in: ");
            education.setDegreeCompleted(scan.nextLine());
            System.out.println("Enter the University:");
            education.setUniversityName(scan.nextLine());
            System.out.println("Enter the Year Completed:");
            education.setYearsCompleted(scan.nextLine());
            System.out.println("Do you want to add more Educational Achivement Yes/No?:");
            Add = scan.nextLine();
            educationlevel.add(education);

        }
        while (Add.equalsIgnoreCase("Yes"));


        do
        {

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
            education.addExperiance(experiance);


        }
        while (Add.equalsIgnoreCase("Yes"));


        do
        {

            System.out.println("Enter your Skills: ");
            skill.setSkilledType(scan.nextLine());
            System.out.println("Enter your Proffesional_Level  :");
            skill.setProffesional_Level(scan.nextLine());
            System.out.println("Do you want to add more Skills Yes/No?:");
            Add = scan.nextLine();
            experiance.addSkills(skill);


        }
        while (Add.equalsIgnoreCase("Yes"));


        System.out.println("================ ");
        System.out.println(name);
        System.out.println(email_address);
        System.out.println("                 ");
        System.out.println("Education");
        for (Education educationlevels : educationlevel)
        {
            System.out.println(educationlevels.getDegreeCompleted() + ",");
            System.out.println(educationlevels.getUniversityName() + "," + educationlevels.getYearsCompleted());
            System.out.println("                 ");
        }
        System.out.println("Experiences");
        for (Experiance experiancelevels : education.getExperiancelevel())
        {

            System.out.println(experiancelevels.getJobTittle());
            System.out.println(experiancelevels.getCompanyName() + "," + experiancelevels.getYearsWorked());

            System.out.println("  -Duty 1," + experiancelevels.getDuty());
            System.out.println("  -Duty 2," + experiancelevels.getDuty2());
            System.out.println("                 ");

        }
//        System.out.println("Skills");
//        for (Skills skillstypes :experiancelevels.());
//        {
//            System.out.println(skillstypes.getSkilledType() + "," + skillstypes.getProffesional_Level());
//        }
    }
}


