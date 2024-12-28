package lesson5;

import java.sql.SQLOutput;

public class MainApp {
    public static void main(String[] args) {

        Student vasya = new Student();

        vasya.name = "Vasya";
        vasya.surname = "Popov";
        vasya.age = 20;
        vasya.numberOfLectures = 5;

        Student oleg = new Student("Oleg", "Popov", 24, 4);
        Student olga = new Student("Olga", "Krasnova", 16, 3);


        System.out.println(vasya.fullname());
        System.out.println(vasya.numbOfLectures());
        vasya.numberOfLectures = 7;
        System.out.println(vasya.numbOfLectures());

        System.out.println(oleg.fullname());
        System.out.println(oleg.numbOfLectures());
        System.out.println(olga.fullname());
        System.out.println(olga.numbOfLectures());

        oleg.numberOfLectures = 8;
        System.out.println(oleg.numbOfLectures());



    }


}
