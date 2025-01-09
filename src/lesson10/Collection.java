package lesson10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

        Product phone = new Product("Phone", 1000, 50);

        Product camera = new Product("Camera", 700, 40);

        Product charger = new Product("Charger", 50, 150);

        List<Product> productArray = new ArrayList<>();

        productArray.add(phone);
        productArray.add(camera);
        productArray.add(charger);

        for (Product product : productArray) {
            if (product.getName().equals("Phone")) {
                System.out.println("Product " + product.getName()
                        + " Price " + product.getPrice()
                        + " Total amount " + product.getNumber());
            }
        }

        for (Product product : productArray) {
            if (product.getPrice()>20) {
                System.out.println("Product " + product.getName()
                        + " Price " + product.getPrice()
                        + " Total amount " + product.getNumber());
            }
        }

        int totalAmount = 0;
        for (Product product : productArray) {
            totalAmount += product.getNumber();
        }
        System.out.println(totalAmount);


        Product tv = new Product("Samsung", 560,14);
        productArray.add(2, tv);
        System.out.println(productArray.size());
        productArray.reversed();
        productArray.subList(0, 4);


    }

}
