package lesson11;

import java.util.*;

public class Hometask1 {
    public static void main(String[] args) {

        List<Integer> listOfNum = new ArrayList<>();

        listOfNum.add(0, 1);
        listOfNum.add(1, 2);
        listOfNum.add(2, 1);
        listOfNum.add(3, 2);
        listOfNum.add(4, 3);
        listOfNum.add(5, 4);
        listOfNum.add(6, 1);
        listOfNum.add(7, 1);

        Set <Integer> listOfNumNoRepeat = new HashSet<>();
        for (int num : listOfNum) {
            listOfNumNoRepeat.add(num);
        }
        System.out.println(listOfNumNoRepeat);

        Map <Integer, Integer> repetition = new HashMap<>();
        for (int num : listOfNum) {
            repetition.put(num, repetition.getOrDefault(num, 0) + 1);
            listOfNumNoRepeat.add(num);

        }

        Set<Map.Entry<Integer, Integer>> entries = repetition.entrySet();
        for (Map.Entry<Integer,Integer> number : entries) {
            var key = number.getKey();
            var value = number.getValue();
            System.out.println(key + ": " + value);
        }
    }
}


