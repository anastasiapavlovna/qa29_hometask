package lesson7.impl;

import lesson7.Domain.Order;

public interface GetOrder {

    void getOrderOnline(Order order);

    void getOrderByPhone(Order order);

}
