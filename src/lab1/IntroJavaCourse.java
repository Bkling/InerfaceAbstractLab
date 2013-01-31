package lab1;

import javax.swing.JOptionPane;

public class IntroJavaCourse extends ProgrammingCourses {
    //This class extends the Super-Class and inherits all the properites
    //This property is unqiue for this class so it must remain

    private String prerequisites;

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    //Overrides the abstract method in the Super-Class
    @Override
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
}
