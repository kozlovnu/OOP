package Homework.hw005.model_notCompleted;

import java.util.List;

public class StudentGroupAttendance {
    private AttendanceOfStudent studentAttendanceOfStudent;
    private List<AttendanceOfStudent> studentGroup;

    public StudentGroupAttendance(List<AttendanceOfStudent> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<AttendanceOfStudent> addStudent(AttendanceOfStudent studentAttendanceOfStudent){
        this.studentGroup.add(studentAttendanceOfStudent);
        return studentGroup;
    }

    public void pritnGroupAttendance(){
        for (int i = 0; i < studentGroup.size(); i++){
            studentAttendanceOfStudent.printAttandance();
        }
        
        System.out.println(getStudentGroup());
    }

    @Override
    public String toString() {
        return "StudentGroup [studentGroup=" + studentGroup + "]";
    }

    public List<AttendanceOfStudent> getStudentGroup() {
        return studentGroup;
    }

    

}
