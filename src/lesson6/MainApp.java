package lesson6;

import static lesson6.Product.TypeProduct.*;

public class MainApp {

    public static void main(String[] args) {

        Product[] products = {
                new Product(23, "Samsung", true, Product.TypeProduct.TV),
                new Product(50, "Apple", true, Product.TypeProduct.AUDIO),
                new Product(27, "BW", true, Product.TypeProduct.MOBILE),
                new Product(24, "Wand", false, Product.TypeProduct.TV),
                new Product(14,"ASOS", true, Product.TypeProduct.AUDIO)

        };

        Service service = new Service();

        int result = service.returnPrice(products, TV);
        System.out.println(result);

        int amount = service.returnAmount(products,AUDIO);
        System.out.println(amount);
    }
}
