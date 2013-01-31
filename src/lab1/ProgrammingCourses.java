package lab1;

import javax.swing.JOptionPane;

public abstract class ProgrammingCourses {
    //This is the Abstract Super Class that the sub-classes will extend.

    //These are some of the properties that the sub-classes all use.
    private String courseName;
    private String courseNumber;
    private double credits;

    //These are the getters and setters to the private properites
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    //This is the Abstract methods that have to be overriden
    public abstract String getCapitalizedCourseName();
}
