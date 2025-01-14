package com.example.observer;

public class MobileStudent implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Obaveštenje putem Mobilnog App: " + message);
    }
}
