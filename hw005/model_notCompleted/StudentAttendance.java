package Homework.hw005.model_notCompleted;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class StudentAttendance {
    private Student student;
    private AttendanceOfStudent attendance;
    Map<Student, Map<LocalDate, Boolean>> studentAttendance = new HashMap<>();

    public StudentAttendance(Student student, AttendanceOfStudent attendance) {
        this.student = student;
        this.attendance = attendance;
    }

    // public Map<Student, Map<LocalDate, Boolean>> studentAttendance(){
        
    //     studentAttendance.put(student, new HashMap<>());
    //     studentAttendance.get(student).put(attendance.getDate(), attendance.isCheck());
    //     return studentAttendance;
    // }


}
