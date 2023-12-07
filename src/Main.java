
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Welcome to the Student Record System for Montclair State University");
        System.out.println("Please select an option to continue");

        System.out.println("L – List: lists all records in the courses\n" +
                "E – Enroll: enrolls the active student in a course; user is prompted for course name; check for conflicts, i.e., student cannot enroll twice in same course\n" +
                "W – Withdraw: deletes an entry in the Enrolled list (or array) corresponding to active student; student is prompted for course name to be withdrawn from\n" +
                "S – Search: search course based on substring of course name which is given by user; list all matching courses\n" +
                "M – My Classes: lists all classes enrolled in by the active student.\n" +
                "\n" +
                "X – Exit: exit application ");

        Course course1 = new Course("Math",4,3);

        double Course1GPA = course1.calculateGPA();

        System.out.println(Course1GPA);
    }
}