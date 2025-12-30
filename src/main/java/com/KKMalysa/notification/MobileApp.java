package com.KKMalysa.notification;

import com.KKMalysa.order.Order;

public class MobileApp implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("APP: Zamówienie o numerze: " + order.getOrderNumber() + " zmieniło status na: "+ order.getOrderStatus());
    }
}
