package Homework.hw005;

public class Student {
    private int id;
    private String name;
    private String surname;
    
    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }

    

}
