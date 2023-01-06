package Homework.hw03;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;




public class StudentGroup implements Iterable<Student> {
    static List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int studentCount() {
        return studentList.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public ListIterator <Student> listIterator(int index){
        return new GroupListIterator(this, index);
    }

    public Iterator<Student> reverseIt(){
        return new ReverseIterator(this);
    }
}
