package com.KKMalysa.notification;

import com.KKMalysa.order.Order;

public class TextMessage implements Observer {

    @Override
    public void update(Order order) {
        System.out.println("SMS: Zamówienie o numerze: " + order.getOrderNumber() + " zmieniło status na: "+ order.getOrderStatus());
    }
}
