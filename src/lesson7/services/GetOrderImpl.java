package lesson7.services;

import lesson7.Domain.Order;
import lesson7.impl.GetOrder;

public class GetOrderImpl implements GetOrder {


    @Override
    public void getOrderOnline(Order order) {
        System.out.println("Get order Online");
    }

    @Override
    public void getOrderByPhone(Order order) {
        System.out.println("Get Order by Phone");

    }
}

