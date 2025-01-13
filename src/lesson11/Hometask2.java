package lesson11;

import java.util.*;

public class Hometask2 {

    public static void main(String[] args) {

        Users user1 = new Users("Vova", 17);
        Users user2 = new Users("Ira", 25);
        Users user3 = new Users("Olga", 18);
        Users user4 = new Users("Vova", 20);

        List<Users> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);

        System.out.println(usersList);

        Set<Users> usersSet = new HashSet<>();
        for (Users user: usersList) {
            usersSet.add(user);
        }
        System.out.println(usersSet);

        usersList.sort(Comparator.comparingInt(Users::getAge));
        for( Users user: usersList) {
            System.out.println(user);
        }

    }
}
