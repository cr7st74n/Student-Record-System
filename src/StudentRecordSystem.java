
//package ProgrammingProject;

import java.util.Scanner;
import java.util.*;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize a fake list of 5 courses;
        List<Course> courseList = new ArrayList<Course>();
        List<Course> courseToEnroll = new ArrayList<Course>();

        Course course1  = new Course("Math",4,4);
        Course course2  = new Course("Programming 101",5,3);
        Course course3  = new Course("Spanish 1",3,2);
        Course course4  = new Course("Data Base",3,3);
        Course course5  = new Course("System Administration",5,4);

        // fill in here with 5 fake courses
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);
        courseList.add(course5);

        // initialize a student:
        Student activeStudent = null;
        System.out.print("Enter student's ID (-1 to create a new student): ");
        int studentIDInput = Integer.parseInt(scanner.nextLine());

        if (studentIDInput == -1) {
            // Create a new student
            System.out.print("Enter student's age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter student's gender: ");
            String gender = scanner.nextLine();

            // Get address information
            // (You can reuse the Address class and create an Address object)
            System.out.print("Enter student's address: \n");

            System.out.print("Enter student's Street: ");
            String street = scanner.nextLine();
            System.out.print("Enter student's City: ");
            String city = scanner.nextLine();
            System.out.print("Enter student's State: ");
            String state = scanner.nextLine();
            System.out.print("Enter student's zip code: ");
            int zipCode = scanner.nextInt();

            // init Address object
            Address address = new Address(street, city, state, zipCode);

            System.out.print("Enter new student's Student ID: ");
            studentIDInput = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter student's name: ");
            String studentName = scanner.nextLine();

            // Create a new student
            activeStudent = new Student(age, gender, address, studentIDInput, studentName);
            String printStudent = activeStudent.toString();
            System.out.println(printStudent);
        }else {
            System.out.println("Student no found. \n");
        }

        while (true) {
            System.out.println("\n Menu:");
            System.out.println("L – List all courses");
            System.out.println("E – Enroll a course");
            System.out.println("W – Withdraw a course");
            System.out.println("S – Search a course by name");
            System.out.println("M – List all My Classes");
            System.out.println("X – Exit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice.toUpperCase()) {
                case "L":
                    // Implement list functionality
                    for (Course listCourses: courseList) {
                        System.out.println("- " +listCourses.getCourseName());         // List all the courses previously initialized.
                    }
                    break;
                case "E":
                    // Implement enroll functionality
                    System.out.println("This are the some of the courses that you can register: \n");
                    for (Course course : courseList) {
                        System.out.println(course.getCourseName());
                    }
                    //init the new enroll course
                    String enrollCourse  = scanner.nextLine();
                    Course newCourse  = new Course(enrollCourse,0,0);

                    //add the bew course to the new list of courses for enroll students
                    courseToEnroll.add(newCourse);
                    //Add the list of courses to the current student.
                    activeStudent.setCourses(courseToEnroll);
                    //Display the courses
                    activeStudent.displayRecord();
                    break;
                case "W":
                    // Implement withdraw functionality
                    System.out.println("Please enter the course you wish to withdraw.");
                    String withdrawCourse = scanner.nextLine();
                    activeStudent.DeleteCourse(withdrawCourse);            // This function search and delete the course in the list of courses from the current student.
                    break;
                case "S":
                    // Implement search functionality
                    System.out.println("Enter the course the you are searching");
                    String searchCourse = scanner.nextLine();                   // this method search the course in the list of courses that are already initialize.
                    activeStudent.searchFunction(searchCourse, courseList);     // This DO NOT search in the current student's courses. Please check the list of courses.

                    break;
                case "M":
                    // Implement my classes functionality
                    activeStudent.displayRecord();   // this will display the courses for the current student.
                    break;
                case "X":
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}