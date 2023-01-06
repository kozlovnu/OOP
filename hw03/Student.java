package Homework.hw03;
/*
 * Создайте класс Student. У студента есть имя, дата рождения и средний балл. Переопределите функцию toString ( ).
Создайте класс StudentGroup. Она содержит коллекцию студентов.
Для коллекции StudentGroup создайте парный класс итератора: StudentGroupIterator. Он реализует интерфейс Iterator<Student>. Он отслеживает текущую позицию в итерации.
Класс StudentGroup реализует интерфейс Iterable<Student>. Это позволяет начать итерацию по группе.
*/
import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate birthday;
    private float avgGrade;

    public Student(String name, LocalDate birthday, float avgGrade) {
        this.name = name;
        this.birthday = birthday;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public static Student nextStudent(int index){
        return StudentGroup.studentList.get(index);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public static int studentCount() {
        return 0;
    }
}
