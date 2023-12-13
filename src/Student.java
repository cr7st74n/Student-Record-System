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

    // Implement methods to add and retrieve course information.
    public void setCourses(List<Course> Courses){
        this.courses = Courses;
    }

    @Override
    public String toString() {
        String printCourses = "";
        for(Course course:courses){
            printCourses +=", " +course.getCourseName();
        }
        return "Student: { " +
                "student Id= " + studentId +
                ", student Name='" + studentName +
                ", courses= " +printCourses +
                '}';
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
        String printCourses = "";
        for(Course course:courses){
            printCourses +="- " +course.getCourseName() +"\n";
        }
        System.out.println(" Courses: \n" +printCourses);

    }
    //Search a course function in the list of courses
    public void searchFunction(String searchCourse, List<Course> listOfCourses){
        for (Course registedCourse : listOfCourses) {
            if (searchCourse.equals( registedCourse.getCourseName())){
                System.out.println("This is your course: " +registedCourse.getCourseName() +" , with Credits: " + registedCourse.getCredits());
            }
        }
    }

    // Implement a function to delete a Course from the course List
    public void DeleteCourse(String courseToDelete){
        for (Course registedCourse : courses) {
            if (courseToDelete.equals( registedCourse.getCourseName())){
                courses.remove(registedCourse);
                break;
            }
        }
    }




}

