public class Course {
    private String courseName;
    private int credits;
    private int grade;

    public Course(String courseName, int credits, int grade) {
        this.courseName = courseName;
        this.credits = credits;
        this.grade = grade;
    }

    // Define getters for course name and credits.

    public void setCourseName(String CourseName){
        this.courseName = CourseName;
    }

    public void setCourseName(int Credits){
        this.credits = Credits;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }


    // Additional methods or attributes related to courses can be added as needed.
    public double calculateGPA(){
        return credits*grade / credits;
    }

}

