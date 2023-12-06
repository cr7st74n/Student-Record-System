import java.util.ArrayList;
import java.util.List;

public class Student extends People implements AcademicRecord {
    private int studentId;
    private String studentName;
    private List<Course> courses;

    public Student(int age, String gender, Address address, int studentId, String studentName) {
        super(age, gender, address);
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    // Implement methods to add and retrieve course information.

    // Design a method to calculate the student's GPA based on their course grades and credits.

    // Implement the methods from the AcademicRecord interface for GPA calculation and record display.

    @Override
    public double calculateGPA() {
        return 0; // update this method
    }

    @Override
    public void displayRecord() {
        // update this method
    }


    // Additional methods or getters/setters can be added as needed.
}

