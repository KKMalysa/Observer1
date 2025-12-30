package com.KKMalysa.notification;

import com.KKMalysa.order.Order;

public class MobileApp {
    public void updateOrderStatus(Order order) {
        System.out.println("APP: Zamówienie o numerze: " + order.getOrderNumber() + "zmieniło status na: "+ order.getOrderStatus());

    };
}
