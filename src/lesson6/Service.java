package lesson6;

import com.sun.source.tree.BreakTree;

public class Service {

    public int returnPrice (Product[] allproducts, TypeProduct type) {

        int productsPrice = 0;
        for (int i = 0; i < allproducts.length; i ++) {
            if (type == allproducts[i].type) {
                productsPrice = productsPrice + allproducts[i].price;
            }
        }
        return productsPrice;
    }

    public int returnAmount (Product[] allproducts, TypeProduct type) {

        int productAmount = 0;
        for (int i = 0; i < allproducts.length; i ++) {
            if (type == allproducts[i].type) {
               if (allproducts[i].isavailable) {
                productAmount = productAmount + 1;
            }

        }
    }
        return productAmount;

    }

}
