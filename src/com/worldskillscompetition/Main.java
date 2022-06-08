package com.worldskillscompetition;
/*
Edinburgh college - Sighthill Campus
H17135 - Software Development Object Oriented Programming
Assesment 01
Name: Adrian Sanchez Rodriguez
ID: EC1939656
Date: 28th April 2022
Version: 1.0
Notes: N/A
 */

import jdk.nashorn.internal.runtime.ECMAException;

public class Main {
    public static void main(String[] args){

        //Instance variables. Used to check the admin credentials
        String username = "Adrian";
        String password = "Sanchez";

        //Teacher roles
        String[] teacherRoles = {"Teacher", "Coach", "Judge"};

        //Score variables
        String scoreBoard = "0.0";
        double score = 0.0;
        int points;
        double pointsD;


        //Adding admin to be able to navigate the app.
        Admin admin = new Admin("Adrian", "Sanchez");

        //Check administrator username and password
        boolean userCheck = checkCredentials(username, password, admin);
        //Check username
        if (userCheck){
            System.out.println("Login successful!");
        }
        else{
            System.out.println("Invalid credentials");
        }

        //Create College objects
        College college1 = new College("Milton Rd Campus", "Edinburgh", "EH15 2PQ");
        System.out.println(college1.toString());
        College college2 = new College("Sighthill Campus", "Edinburgh", "EH11 4DE");
        System.out.println(college2.toString());

        //Create student objects
        Student student1 = new Student("student1","1234","Adrian Sanchez", "2/5 Bonnington Avenue", "07597129679","Full-Time");
        System.out.println(student1.toString());
        Student student2 = new Student("student2","1234","Mai Barbosa", "19 Raedburn pl", "07896234875","Part-Time");
        System.out.println(student2.toString());
        Student student3 = new Student("student3","1234","Iain Mckinnon", "2/5 Bonnington Avenue", "07896234875","Apprentice");
        System.out.println(student3.toString());
        Student student4 = new Student("student4","1234","Pav Gill", "85 Rose St", "07855324015","Full-Time");
        System.out.println(student4.toString());
        Student student5 = new Student("student5","1234","Bogdan Kaspersen", "22 Albert Road", "07597129679","Apprentice");
        System.out.println(student5.toString());
        Student student6 = new Student("student6","1234","Filibert Gold", "9729 King Street", "07896234875","Part-Time");
        System.out.println(student6.toString());
        Student student7 = new Student("student7","1234","Innocenzo Bonaccorso", "3 Park Lane", "07896234875","Part-Time");
        System.out.println(student7.toString());
        Student student8 = new Student("student8","1234","Quin Reece", "22 Springfield Road", "07855324015","Full-Time");
        System.out.println(student8.toString());
        Student student9 = new Student("student9","1234","Fridumar Moore", "90 Queen Street", "07597129679","Apprentice");
        System.out.println(student9.toString());
        Student student10 = new Student("student10","1234","Anantha Moretti ", "94 Mill Road", "07896234875","Part-Time");
        System.out.println(student10.toString());
        Student student11 = new Student("student11","1234","Svetlana Agricola ", "23 Grove Road", "07896234875","Part-Time");
        System.out.println(student11.toString());
        Student student12 = new Student("student12","1234","Fatimah Cullen ", "410 Stanley Road", "07855324015","Apprentice");
        System.out.println(student12.toString());

        //Create Teacher objects
        Teacher teacher1 = new Teacher("teacher1","1234","Quin Reece", "22 Springfield Road", "07855324015");
        teacher1.setRole(teacherRoles[0]);
        System.out.println(teacher1.toString());
        Teacher teacher2 = new Teacher("teacher2","1234","Iain Mckinnon","2/5 Bonnington Avenue","07597129679");
        teacher2.setRole(teacherRoles[1]);
        System.out.println(teacher2.toString());
        Teacher teacher3 = new Teacher("teacher3","1234", "Mai Barbosa", "19 Raeburn Pl", "07856235486");
        teacher3.setRole(teacherRoles[2]);
        System.out.println(teacher3.toString());
        Teacher teacher4 = new Teacher("teacher4", "1234", "Kumi Gilchrist", "85 Rose St", "07459654123");
        teacher4.setRole(teacherRoles[1]);
        System.out.println(teacher4.toString());
        Teacher teacher5 = new Teacher("Teacher5", "1234", "Lorna Cuttle", "20 Shandwick Pl", "07419658423");
        teacher5.setRole(teacherRoles[1]);
        System.out.println(teacher5.toString());

        //Create Competition category objects
        Category category1 = new Category("Software Development");
        System.out.println(category1.toString());
        Category category2 = new Category("Networking");
        System.out.println(category2.toString());
        Category category3 = new Category("Web Design");
        System.out.println(category3.toString());

        //Create Team objects
        Team team1 = new Team("Team1",category1,college1,teacher2,student1,student2,student3,student4);
        System.out.println(team1.toString());
        Team team2 = new Team("Team2",category2,college1,teacher4,student5,student6,student7,student8);
        System.out.println(team2.toString());
        Team team3 = new Team("Team3",category3,college2,teacher5,student9,student10,student11,student12);
        System.out.println(team3.toString());

        //Judge Scoring Team 1 (integer points)
        points = 10;
        //Check for negative values in points
        try{
            checkPointInput(points);
        }
        catch(Exception e){
            System.out.println("The system can't accept negative values");
             points = 0;
        }

        score += teacher3.addPoints(points);
        scoreBoard = Double.toString(score);
        team1.setTeamScore(scoreBoard);
        System.out.println("Judge " + teacher3.getName() + " scored " + points + " points to " + team1.getTeamName() + ".");
        System.out.println(team1.toString());

        //Judge Scoring Team2 (double points)
        score = 0;
        pointsD = 12.7;
        //Check for negative values in points
        try{
            checkPointInput(pointsD);
        }
        catch(Exception e){
            System.out.println("The system can't accept negative values");
            pointsD = 0;
        }

        score += teacher3.addPoints(pointsD);
        scoreBoard = Double.toString(score);
        team2.setTeamScore(scoreBoard);
        System.out.println("Judge " + teacher3.getName() + " scored " + pointsD + " points to " + team2.getTeamName() + ".");
        System.out.println(team2.toString());
    }
    private static void checkPointInput(int points) {
        if (points < 0 ){
            throw new ArithmeticException("The system can't accept negative values");
        }
    }
    private static void checkPointInput(double points) {
        if (points < 0.0 ){
            throw new ArithmeticException("The system can't accept negative values");
        }
    }

    private static boolean checkCredentials(String username, String password, Admin admin) {
        return(admin.getUsername().equals(username)) && (admin.getPassword().equals(password));
    }
}
