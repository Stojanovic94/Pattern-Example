package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class ExamResultsSystem implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String examResults;

    public void setExamResults(String results) {
        this.examResults = results;
        notifyObservers(); // Obaveštavamo sve posmatrače
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(examResults);
        }
    }
}
