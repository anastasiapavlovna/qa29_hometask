package lesson7.services;

import lesson7.Domain.Order;
import lesson7.impl.Delivery;

public class DeliveryImpl implements Delivery {

    public void deliveryHome(Order order) {
        System.out.println("Delivery to Home");
    }

}
