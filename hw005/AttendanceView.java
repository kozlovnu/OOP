package Homework.hw005;

import java.time.LocalDate;
import java.util.Map;

public class AttendanceView {
    AttendanceService studentAttendance;

    public AttendanceView(AttendanceService studentAttendance) {
        this.studentAttendance = studentAttendance;
    }

    public void showAttendance(){
        Map<Student, Map<LocalDate, Boolean>> log = studentAttendance.getStudentAttendance();
        for (Student student : log.keySet()){
            System.out.println(student + ":");
            Map<LocalDate, Boolean> studentLog = log.get(student);
            for (LocalDate date : studentLog.keySet()){
                System.out.println("\t : " + date + ": " + (studentLog.get(date) ? "true" : "false"));
            }
            System.out.println();
        }
    }

}
