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
    // getters/setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String StudentName){
        this.studentName = StudentName;
    }

    //     Getters
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }

    @Override
    public String toString() {
        String printCourses = "";
        for(Course course:courses){
            printCourses +=" " +course;
        }
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", courses=" +printCourses +
                '}';
    }

    // Implement methods to add and retrieve course information.
    public void setCourses(List<Course> Courses){
        this.courses = Courses;
    }

    // Design a method to calculate the student's GPA based on their course grades and credits.
    @Override
    public double calculateGPA() {
        double TotalGPA = 0;
        for (Course course: courses) {
            TotalGPA += course.calculateGPA();
        }
        return TotalGPA/courses.size();
    }

    // Implement the methods from the AcademicRecord interface for GPA calculation and record display.
    @Override
    public void displayRecord() {
        toString();
    }


}

