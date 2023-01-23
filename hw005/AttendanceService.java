package Homework.hw005;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AttendanceService {
    
    private Map<Student, Map<LocalDate, Boolean>> studentAttendance;

    public AttendanceService(){
        studentAttendance = new HashMap<>();
    }

    public Map<Student, Map<LocalDate, Boolean>> addStudentAttenance(Student student, LocalDate date, boolean check){
        if (!studentAttendance.containsKey(student)){
            studentAttendance.put(student, new HashMap<>());
        }
        studentAttendance.get(student).put(date, check);
        return studentAttendance;
    }

    public Map<Student, Map<LocalDate, Boolean>> getStudentAttendance(){
        return studentAttendance;
    }

}
