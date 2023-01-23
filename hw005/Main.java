package Homework.hw005;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        
        Student student = new Student(001, "Vasya", "Pupkin");
        Student student2 = new Student(002, "Petr", "Petrov");
        Student student3 = new Student(003, "Mike", "Jason");

        AttendanceService attendance = new AttendanceService();
        attendance.addStudentAttenance(student, LocalDate.of(2022, 12, 1), true);
        attendance.addStudentAttenance(student, LocalDate.of(2022, 12, 3), true);
        attendance.addStudentAttenance(student, LocalDate.of(2022, 12, 5), true);
        attendance.addStudentAttenance(student, LocalDate.of(2022, 12, 11), true);

        attendance.addStudentAttenance(student2, LocalDate.of(2022, 12, 1), true);
        attendance.addStudentAttenance(student2, LocalDate.of(2022, 12, 3), true);
        attendance.addStudentAttenance(student2, LocalDate.of(2022, 12, 5), true);
        attendance.addStudentAttenance(student2, LocalDate.of(2022, 12, 11), false);

        attendance.addStudentAttenance(student3, LocalDate.of(2022, 12, 1), true);
        attendance.addStudentAttenance(student3, LocalDate.of(2022, 12, 3), false);
        attendance.addStudentAttenance(student3, LocalDate.of(2022, 12, 5), false);
        attendance.addStudentAttenance(student3, LocalDate.of(2022, 12, 11), false);

        AttendanceView view = new AttendanceView(attendance);
        AttendancePresenter presenter = new AttendancePresenter(attendance, view);

        System.out.println("All students: ");
        presenter.printAllStudents();
        System.out.println("******************************");
        System.out.println();

        System.out.println("Student Attendance:");
        presenter.printStudentsAttendance();
        System.out.println("******************************");
        System.out.println();

        System.out.println("Student sorted attendance:");
        presenter.printSortedAttendance();
        System.out.println("******************************");
        System.out.println();
        
        System.out.println("Student Attendance below 25%:");
        presenter.printLowestAttendance();


    }
}
