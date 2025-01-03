package lesson6;

import static lesson6.TypeProduct.*;

public class MainApp {

    public static void main(String[] args) {

        Product[] products = {
                new Product(23, "Samsung", true, TypeProduct.TV),
                new Product(50, "Apple", true, TypeProduct.AUDIO),
                new Product(27, "BW", true, TypeProduct.MOBILE),
                new Product(24, "Wand", false, TypeProduct.TV),
                new Product(14,"ASOS", true, TypeProduct.AUDIO)

        };

        Service service = new Service();

        int result = service.returnPrice(products, TV);
        System.out.println(result);

        int amount = service.returnAmount(products, AUDIO);
        System.out.println(amount);
    }
}
