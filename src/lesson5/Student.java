package lesson5;

public class Student {

    public String name;

    public String surname;

    public int age;

    public int numberOfLectures;

    public Student(){

    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, String surname, int age, int numberOfLectures) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numberOfLectures = numberOfLectures;

    }


    public String fullname() {
        String sum = "Name: " + name + ", surname: " + surname;
        return sum;
    }

    public String numbOfLectures() {
        String numbOdlect = surname + " visited " + numberOfLectures + " lectures";
        return numbOdlect;

    }
}
