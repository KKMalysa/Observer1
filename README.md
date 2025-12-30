📌 Overview

This repository contains a minimal, focused implementation of the Observer design pattern in Java.
The goal of the project is educational: to demonstrate how the pattern works, when it should be used, and what trade-offs it introduces.

The implementation intentionally avoids frameworks and advanced abstractions to keep the core idea of the pattern clear and explicit.

🎯 Purpose of the Project

This project was created to:

- understand the Observer pattern mechanics
- practice clean separation of responsibilities
- simulate a real-world state change notification scenario
- provide a discussion-ready example for technical interviews or design pattern reviews

🧩 Problem Statement

In many systems, we encounter a situation where:
- one object (the subject) changes its state
- multiple other objects (observers) must react to that change
- the subject should not know concrete details about observers
  
 Hard-coding dependencies between these components leads to:
- tight coupling
- poor extensibility
- difficult testing

💡 Solution: Observer Pattern

The Observer pattern solves this problem by introducing:

- a Subject that maintains a list of observers
- an Observer interface defining a notification contract
- concrete observers reacting to state changes

This allows:

- loose coupling
- dynamic subscription/unsubscription
- easier extension without modifying existing code

🏗️ Architecture Overview
Roles in the Pattern

Subject
- maintains a list of observers
- exposes methods to attach / detach observers
- notifies observers when its state changes

Observer
- defines a common update interface
- ConcreteObserver
- reacts to notifications from the subject

High-level Flow

Client
  |
  v
Subject -----> Observer A
   |           Observer B
   |           Observer C
   |
 state change
   |
 notifyObservers()


⚙️ Implementation Notes

- The project uses plain Java (no Spring, no event frameworks)
- Observer registration is explicit and manual
- Notifications are synchronous
- The design prioritizes readability over optimization

This makes the pattern easy to reason about and debug.

▶️ How to Run

Clone the repository
Build the project using Maven
Run the main class to observe how:
observers are registered
subject state changes
observers react to notifications

🧠 Advantages & Disadvantages

Advantages:
loose coupling between subject and observers
open/closed principle respected
easy to add new observers

Disadvantages:
observers are notified blindly (no context filtering)
synchronous updates can cause performance issues
potential memory leaks if observers are not deregistered

🔄 Alternatives & Real-World Variants

In production systems, the Observer pattern is often replaced or enhanced by:
- Spring Application Events
- Message brokers (Kafka, RabbitMQ)
- Reactive streams (Project Reactor, RxJava)

These solutions address scalability, asynchronicity, and fault tolerance.

🧪 When NOT to Use Observer

Avoid this pattern when:
- there is only a single dependent object
- updates must be transactional
- ordering and failure handling are critical

In such cases, direct method calls or domain services may be a better choice.

📚 Learning Outcome

This project demonstrates not just how to implement Observer, but why and when it makes sense to use it.

It is intentionally small, focused, and designed to spark architectural discussion rather than showcase framework usage.
