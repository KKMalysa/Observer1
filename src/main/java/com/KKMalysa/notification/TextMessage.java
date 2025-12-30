package com.KKMalysa.notification;

import com.KKMalysa.order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order) {
        System.out.println("SMS: Zamówienie o numerze: " + order.getOrderNumber() + "zmieniło status na: "+ order.getOrderStatus());

    };
}
