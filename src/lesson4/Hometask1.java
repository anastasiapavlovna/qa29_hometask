package lesson4;

import java.util.Arrays;

public class Hometask1 {
    public static void main(String[] args) {

        int array[] = new int[]{3, 5, 6, 9, 2};

        int array2[] = new int[]{1, 16, -1, 5};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    System.out.println("the same element:" + array[i]);
                }
            }
        }



        // TASK2

        int amount = 0;

        for (int i = 0; i < array.length; i++) {

            amount = amount + 1;

        }

        System.out.println(amount);

        // TASK2.B

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
        }

        System.out.println(sum);

        // TASK2.C

        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {

                max = array[i];
            }
        }

        System.out.println(max);

        // TASK2.D

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {

                min = array [i];

            }
        }

        System.out.println(min);
    }
}
