package Homework.hw03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
Создайте класс Student. У студента есть имя, дата рождения и средний балл. Переопределите функцию toString ( ).
Создайте класс StudentGroup. Она содержит коллекцию студентов.
Для коллекции StudentGroup создайте парный класс итератора: StudentGroupIterator. Он реализует интерфейс Iterator<Student>. Он отслеживает текущую позицию в итерации.
Класс StudentGroup реализует интерфейс Iterable<Student>. Это позволяет начать итерацию по группе.
 */
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Denis", LocalDate.of(1990, 7,12), 4.5f);
        Student st2 = new Student("Masha", LocalDate.of(1988,12,5), 4.1f);
        Student st3 = new Student("Anna", LocalDate.of(1989, 5, 13), 3.6f);
        Student st4 = new Student("Petr", LocalDate.of(1991,8,31), 4.9f);
        Student st5 = new Student("Vasya", LocalDate.of(1995, 3,8), 3.9f);


        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);


        StudentGroup studentGroup = new StudentGroup(list);

        Iterator<Student> studentIt = studentGroup.iterator();


        System.out.println("------------");
        System.out.println("StudentGroupIterator => ");
        while (studentIt.hasNext()) {
            System.out.println(studentIt.next());
        }

        System.out.println("------------");
        System.out.println("GroupListIterator => ");
        System.out.println("Next => ");

        Iterator<Student> listItNext = studentGroup.listIterator(0);
        while (listItNext.hasNext()){
            System.out.println(listItNext.next());
        }

        System.out.println("------------");
   
        System.out.println("Previous => ");

        Iterator<Student> listItPrevious = studentGroup.listIterator(4);
        while (((ListIterator<Student>) listItPrevious).hasPrevious()){
            System.out.println(((ListIterator<Student>) listItPrevious).previous());
        }

        System.out.println("------------");
        System.out.println("ReverseIterator => ");
        Iterator<Student> reverseIt = studentGroup.reverseIt();

        while (reverseIt.hasNext()){
            System.out.println(reverseIt.next());
        }
        
    }
}
