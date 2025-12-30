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

        textMessage.updateOrderStatus(order1);
        mobileApp.updateOrderStatus(order1);
        email.updateOrderStatus(order1);
    }


}