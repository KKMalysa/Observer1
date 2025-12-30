package com.KKMalysa.order;

import com.KKMalysa.notification.Observer;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

public class Order implements Obervable {

    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.update(this); //this = order
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObservers();
    }
}
