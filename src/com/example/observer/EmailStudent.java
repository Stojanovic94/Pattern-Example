package com.example.observer;

public class EmailStudent implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Obaveštenje putem Email-a: " + message);
    }
}
