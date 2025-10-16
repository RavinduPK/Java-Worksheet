package LW_03;

import java.util.Scanner;

class Course {
    String courseName;
    int courseCode;

    public Course(){
        courseName = "Unknown";
        courseCode = 0;
    }

    public void setCourseName(String name){
        courseName = name;
    }

    public void setCourseCode(int code){
        courseCode = code;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCourseCode(){
        return courseCode;
    }

}


class Lecture {
    String lectureName ;
    String courseTeaching ;




    public Lecture(){
        lectureName = "Unknown";
        courseTeaching = "Unknown";
    }

    public void setLectureName(String name){
        lectureName = name;
    }

    public void setCourseTeaching(String course){
        courseTeaching = course;
    }

    public String getLectureName(){
        return lectureName;
    }

    public String getCourseTeaching(){
        return courseTeaching;
    }
}




class Student {
    String studentName;
    String degreeName;
    String courseFollowing;

    public Student() {
        studentName = "Unknown";
        degreeName = "Unknown";
        courseFollowing = "Unknown";
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public void setDegreeName(String degree) {
        degreeName = degree;
    }

    public void setCourseFollowing(String course) {
        courseFollowing = course;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;

    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create and set up Course
        Course course = new Course();
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter course code: ");
        int courseCode = Integer.parseInt(scanner.nextLine());


        course.setCourseName(courseName);
       course.setCourseCode(courseCode);






         // Create and set up Lecture

        Lecture lecture = new Lecture();
        System.out.print("Enter lecture name: ");
        String lectureName = scanner.nextLine();
        lecture.setLectureName(lectureName);



        System.out.println("Enter course teaching: ");
        String courseTeaching = scanner.nextLine();
        lecture.setCourseTeaching(courseTeaching);





        Student student = new Student();
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        student.setStudentName(studentName);


        System.out.println("Enter your degree name: ");
        String degreeName = scanner.nextLine();
        student.setDegreeName(degreeName);


        System.out.println("Enter course following: ");
        String courseFollowing = scanner.nextLine();
        student.setCourseFollowing(courseFollowing);



        System.out.println("Your Course Name :" + course.getCourseName());
        System.out.println("Your Course code :" + course.getCourseCode());
        System.out.println("Your Lecture Name :" + lecture.getLectureName());
        System.out.println("Your Course Teaching :" + lecture.getCourseTeaching());
        System.out.println("Your Student Name :" + student.getStudentName());
        System.out.println("Your Degree Name :" + student.getDegreeName());
        System.out.println("Your Course Following :" + student.getCourseFollowing());

    }
}