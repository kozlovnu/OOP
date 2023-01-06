package Homework.hw03;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {

    protected int index = 0;
    private StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.studentCount();
    }

    @Override
    public Student next() {
        return Student.nextStudent(index++);
    }
}
