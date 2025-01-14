package com.example.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        ExamResultsSystem examSystem = new ExamResultsSystem();

        // Kreiranje posmatrača
        Observer emailStudent = new EmailStudent();
        Observer mobileStudent = new MobileStudent();

        // Dodavanje posmatrača
        examSystem.addObserver(emailStudent);
        examSystem.addObserver(mobileStudent);

        // Postavljanje rezultata ispita
        examSystem.setExamResults("Rezultati ispita su objavljeni!");
    }
}
