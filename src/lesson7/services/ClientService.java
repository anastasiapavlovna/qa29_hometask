package lesson7.services;

import lesson7.Domain.Order;
import lesson7.impl.*;

public class ClientService implements ClientServiceOrder {
    private GetOrder gettheorder;
    private SaveOrder savetheorder;
    private Cooking cookingtheorder;
    private Delivery deliveringtheorder;

    public ClientService(GetOrder gettheorder, SaveOrder savetheorder, Cooking cookingtheorder, Delivery deliveringtheorder) {
        this.gettheorder = gettheorder;
        this.savetheorder = savetheorder;
        this.cookingtheorder = cookingtheorder;
        this.deliveringtheorder = deliveringtheorder;
    }
    @Override
    public void createOrder(Order order) {
        System.out.println("step 1");
        gettheorder.getOrderOnline(order);
        System.out.println("step 2");
        savetheorder.saveOrder(order);
        System.out.println("step 3");
        cookingtheorder.cookOrder(order);
        System.out.println("step 4");
        deliveringtheorder.deliveryWindow(order);
    }
}
