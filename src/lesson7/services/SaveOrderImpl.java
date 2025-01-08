package lesson7.services;

import lesson7.Domain.Order;
import lesson7.impl.SaveOrder;

public class SaveOrderImpl implements SaveOrder {


    @Override
    public void saveOrder(Order order) {
        System.out.println("Save Order in the system");
    }
}
