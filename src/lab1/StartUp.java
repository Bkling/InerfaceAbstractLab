package lab1;

public class StartUp {

    public static void main(String[] args) {
        //This is the StartUp to the project, this is where I will enter and 
        //show some data in the console output.

        //This is the IntroToProgrammingCourse
        ProgrammingCourses introProgramming = new IntroToProgrammingCourse();
        introProgramming.setCourseName("Intro to Programming Course");
        introProgramming.setCourseNumber("152-107-014");
        introProgramming.setCredits(2.0);

        //Display the data in the console output
        System.out.println("Course Name: " + introProgramming.getCapitalizedCourseName());
        System.out.println("Course Number: " + introProgramming.getCourseNumber());
        System.out.println("Credits: " + introProgramming.getCredits());
        //Create a Blank Line
        System.out.println("");

        //This is the IntroJavaCourse
        ProgrammingCourses introJava = new IntroJavaCourse();
        introJava.setCourseName("Intro to Java Course");
        introJava.setCourseNumber("152-134-003");
        introJava.setCredits(4.0);

        //Display the data in the console output
        System.out.println("Course Name: " + introJava.getCapitalizedCourseName());
        System.out.println("Course Number: " + introJava.getCourseNumber());
        System.out.println("Credits: " + introJava.getCredits());
        //Create a Blank Line
        System.out.println("");

        //This is the AdvancedJavaCourse
        ProgrammingCourses advancedJava = new AdvancedJavaCourse();
        advancedJava.setCourseName("Advanced Java");
        advancedJava.setCourseNumber("152-135-004");
        advancedJava.setCredits(4.0);

        //Display the data in the console output
        System.out.println("Course Name: " + advancedJava.getCapitalizedCourseName());
        System.out.println("Course Number: " + advancedJava.getCourseNumber());
        System.out.println("Credits: " + advancedJava.getCredits());
        //Create a Blank Line
        System.out.println("");
    }
}
