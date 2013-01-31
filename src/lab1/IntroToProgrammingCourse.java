package lab1;

public class IntroToProgrammingCourse extends ProgrammingCourse {
    //This class extends the Super-Class and inherits all the properites
    //Overrides the abstract method in the Super-Class
    //Overrides the abstract method in the Super-Class

    @Override
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
}
