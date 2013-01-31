package lab2;

public class StartUp {

    public static void main(String[] args) {
        //This is the StartUp to the project, this is where I will enter and 
        //show some data in the console output.
        
        //This is the IntroToProgrammingCourse
        IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse();
        introProgramming.setCourseName("Intro to Programming Course");
        introProgramming.setCourseNumber("152-107-014");
        introProgramming.setCredits(2.0);
        
        //Display the data in the console output
        System.out.println("Course Name: " + introProgramming.getCourseName());
        System.out.println("Course Number: " + introProgramming.getCourseNumber());
        System.out.println("Credits: " + introProgramming.getCredits());
        //Create a Blank Line
        System.out.println("");
        
        //This is the IntroJavaCourse
        IntroJavaCourse javaCourse = new  IntroJavaCourse();
        javaCourse.setCourseName("Intro Java Course");
        javaCourse.setCourseNumber("152-134-003");
        javaCourse.setCredits(4.0);
        javaCourse.setPrerequisites("Introduction to Programming, or Basic Programming and Logic, or JavaScript");
        
        //Display the data in the console output
        System.out.println("Course Name: " + javaCourse.getCourseName());
        System.out.println("Course Number: " + javaCourse.getCourseNumber());
        System.out.println("Credits: " + javaCourse.getCredits());
        System.out.println("Prerequisites: " + javaCourse.getPrerequisites());
        //Create a Blank Line
        System.out.println("");
        
        //This is the AdvancedJavaCourse
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse();
        advancedJava.setCourseName("Advanced Java");
        advancedJava.setCourseNumber("152-135-004");
        advancedJava.setCredits(4.0);
        advancedJava.setPrerequisites("Java Programming");
        
        //Display the data in the console output
        System.out.println("Course Name: " + advancedJava.getCourseName());
        System.out.println("Course Number: " + advancedJava.getCourseNumber());
        System.out.println("Credits: " + advancedJava.getCredits());
        System.out.println("Prerequisites: " + advancedJava.getPrerequisites());
        //Create a Blank Line
        System.out.println("");
        
        //Using Liskov Substitution Principle doesn't work as well here because 
        //the properites and the methods are mainly in the Sub-Classes, the interface
        //only contains 3 methods that the Sub-Classes overwrite.
        
    }
}
