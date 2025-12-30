package com.KKMalysa;

import com.KKMalysa.notification.Email;
import com.KKMalysa.notification.MobileApp;
import com.KKMalysa.notification.TextMessage;
import com.KKMalysa.order.Order;
import com.KKMalysa.order.OrderStatus;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order1.registerObserver(mobileApp);
        order1.registerObserver(email);
        order1.registerObserver(textMessage);

        order1.notifyObservers();
        System.out.println();

        order1.unregisterObserver(mobileApp);
        order1.changeOrderStatus(OrderStatus.WYSŁANE);
    }


}