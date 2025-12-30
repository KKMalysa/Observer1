package com.KKMalysa.notification;

import com.KKMalysa.order.Order;

public class Email implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("EMAIL: Zamówienie o numerze: " + order.getOrderNumber() + " zmieniło status na: "+ order.getOrderStatus());
    }
}
