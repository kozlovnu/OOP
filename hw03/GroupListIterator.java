package Homework.hw03;

import java.util.ListIterator;

public class GroupListIterator extends StudentGroupIterator implements ListIterator<Student> {

    public GroupListIterator(StudentGroup studentGroup, int current) {
        super(studentGroup);
        index = current;
    }

    public boolean hasPrevious() {
        return index > -1;
    }

    public Student previous() {
        return Student.nextStudent(index--);
    }

    @Override
    public int nextIndex() {
   
        return index;
    }

    @Override
    public int previousIndex() {
    
        return index-1;
    }

    @Override
    public void remove() {   
    }

    @Override
    public void set(Student e) {     
    }

    @Override
    public void add(Student e) {    
    }

}
