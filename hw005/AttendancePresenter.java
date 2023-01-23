package Homework.hw005;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AttendancePresenter {
    private AttendanceService attendanceService;
    private AttendanceView attendanceView;

    public AttendancePresenter(AttendanceService attendanceService, AttendanceView attendanceView) {
        this.attendanceService = attendanceService;
        this.attendanceView = attendanceView;
    }

    public void printAllStudents(){
        attendanceView.showAttendance();
    }
    
    public void printStudentsAttendance(){
        double attendancePercent;
        for (Student student : attendanceService.getStudentAttendance().keySet()){
            attendancePercent = 100 * attendanceService.getStudentAttendance().get(student).values().stream().filter(a -> a).count() /
            attendanceService.getStudentAttendance().get(student).size();
            System.out.println(student + " has attendance of " + attendancePercent + "%");
        }
        System.out.println();
    }

    public void printSortedAttendance(){
        Map <Double, List<Student>> sortedAttendance = new TreeMap<>();
        for (Student student : attendanceService.getStudentAttendance().keySet()){
            double attendancePercent = 100 * attendanceService.getStudentAttendance().get(student).values().stream().filter(a -> a).count() /
            attendanceService.getStudentAttendance().get(student).size();

            if (!sortedAttendance.containsKey(attendancePercent)){
                sortedAttendance.put(attendancePercent, new ArrayList<>());
            }
            sortedAttendance.get(attendancePercent).add(student);
        }

        for (double attendancePercent : ((TreeMap<Double, List<Student>>) sortedAttendance).descendingKeySet()){
            System.out.println("Attendance is " + attendancePercent + "%");
            for (Student student : sortedAttendance.get(attendancePercent)){
                System.out.println(student);
            }
            System.out.println();
        }

    }

    public void printLowestAttendance(){
        List<Student> lowestAttendanceList = new ArrayList<>();
        for (Student student : attendanceService.getStudentAttendance().keySet()){
            double attendancePercent = 100 * attendanceService.getStudentAttendance().get(student).values().stream().filter(a -> a).count() /
            attendanceService.getStudentAttendance().get(student).size();
            if (attendancePercent <= 25){
                lowestAttendanceList.add(student);
            }
        }

        for (Student student : lowestAttendanceList){
            System.out.println(student);
        }
    }

}
