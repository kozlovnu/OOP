package Homework.hw005.model_notCompleted;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class AttendanceOfStudent {
    private Student student;
    private Map<LocalDate, Boolean> log = new HashMap<>();

    public AttendanceOfStudent(Student student, Map<LocalDate, Boolean> log) {
        this.student = student;
        this.log = log;
    }

    public Map<LocalDate, Boolean> setAttendance(LocalDate date, boolean check) {

        log.put(date, check);
        return log;
    }

    public void printAttandance(){
        // log.forEach((k,v) -> {
        //     System.out.println(student.toString() + k + " : " + v);
        // });
        System.out.println(student + "\n" + getLog());
    }


    public Map<LocalDate, Boolean> getLog() {
        return log;
    }    


}
