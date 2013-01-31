package lab1;

public class StartUp {

    public static void main(String[] args) {
        //This is the StartUp to the project, this is where I will enter and 
        //show some data in the console output.
        
        //This is the IntrotoProgrammingCourse
        ProgrammingCourses introProgramming = new IntroToProgrammingCourse();
        introProgramming.setCourseName("Intro to Programming Course");
        introProgramming.setCourseNumber("152-107-014");
        introProgramming.setCredits(2.0);

        
        //Display the data in the console output
        System.out.println("Course Name: " + introProgramming.getCapitalizedCourseName());
        System.out.println("Course Number: " + introProgramming.getCourseNumber());
        System.out.println("Credits: " + introProgramming.getCredits());
    }
}
