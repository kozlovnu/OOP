package Homework.hw03;

public class ReverseIterator extends StudentGroupIterator {

    public ReverseIterator(StudentGroup studentGroup) {
        super(studentGroup);
        index = studentGroup.studentCount()-1;
    }

    @Override
    public boolean hasNext() {
        return index > -1;
    }

    @Override
    public Student next() {
        return Student.nextStudent(index--);
    }

    
    





}
