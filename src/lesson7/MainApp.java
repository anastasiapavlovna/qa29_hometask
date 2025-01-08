package lesson7;

import lesson7.Domain.Order;
import lesson7.impl.ClientServiceOrder;
import lesson7.services.*;

public class MainApp {
    public static void main(String[] args) {

        Order order = new Order();

        ClientServiceOrder clientservice = new ClientService (
                new GetOrderImpl(),
                new SaveOrderImpl(),
                new CookingImpl(),
                new DeliveryImpl());

        clientservice.createOrder(order);

    }

}
