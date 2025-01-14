# Observer Design Pattern Example: Exam Results Notification System

This repository demonstrates the **Observer (Posmatrač)** design pattern through an example of a system that notifies students when exam results are published. The Observer pattern, a **behavioral design pattern**, establishes a "one-to-many" relationship between a subject and its observers, ensuring dynamic notifications when the subject's state changes.

## Overview of the Observer Design Pattern

### Key Principles:
1. **One-to-Many Relationship**:  
   A single subject (e.g., `ExamResultsSystem`) manages a list of observers (e.g., `EmailStudent`, `MobileStudent`) subscribed to its events.
   
2. **Dynamic Notifications**:  
   When the subject's state changes (e.g., exam results are published), all subscribed observers are automatically notified.

3. **Loose Coupling**:  
   The subject is not aware of the implementation details of its observers. It only calls the `update()` method, and the observers decide how to process the information.

---

## Components in This Example

### 1. **Subject**  
   The `Subject` interface defines methods for:
   - Adding observers (`addObserver()`)
   - Removing observers (`removeObserver()`)
   - Notifying all observers (`notifyObservers()`)

   #### Implementation:  
   `ExamResultsSystem` implements the `Subject` interface:
   - Maintains a list of observers.
   - Contains the logic for notifying all observers when results are updated.

---

### 2. **Observers**  
   The `Observer` interface defines the `update()` method.

   #### Concrete Implementations:
   - **`EmailStudent`**: Sends exam result notifications via email.  
   - **`MobileStudent`**: Sends notifications via mobile devices.  

---

### 3. **Event (State Change)**  
   A change in the state of the subject (`setExamResults()`) triggers the `notifyObservers()` method, which informs all subscribed observers.

---
