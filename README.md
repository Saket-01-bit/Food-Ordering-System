# Food Ordering System (Java, OOP-Based Design)

A fully modular Food Ordering System built using core Java, designed to simulate real-world ordering workflows with clean architecture and scalable object-oriented design.

This project focuses on writing maintainable, extensible code while applying design patterns and efficient data structures.

---

## Problem Statement

Design a system that allows users to:

- Browse a menu of food items
- Customize items dynamically
- Add items to a cart with quantity management
- Place orders and track order history

The system should be extensible, efficient, and easy to maintain.

---

## Key Highlights

- Clean Object-Oriented Design (Abstraction, Inheritance, Encapsulation, Polymorphism)
- Use of Prototype Design Pattern for item creation
- Efficient cart implementation using HashMap
- Modular architecture enabling easy feature extension
- Separation of concerns between menu, cart, and order logic

---

## System Architecture

The application follows a layered flow:

User → Menu → Item Selection → Customization → Cart → Checkout → Order History

### Core Components

- FoodOrderingSystem  
  Handles user interaction and overall flow control

- Menu  
  Maintains the list of available food items

- FoodItem (Abstract Class)  
  Base blueprint for all food items with cloning support

- Concrete Classes  
  Pizza, Burger, Salad, Soda

- ShoppingCart  
  Manages items and quantities using a HashMap

- Order  
  Stores completed transactions with unique order IDs

---

## Design Decisions

### 1. Prototype Pattern

Instead of modifying original menu items, the system clones objects before customization.

Benefits:
- Prevents mutation of base menu data
- Supports flexible customization
- Improves scalability for adding new item types

---

### 2. HashMap for Cart Management

```java
Map<FoodItem, Integer>

Food-Ordering-System/
│
├── FoodOrderingSystem.java
├── Menu.java
├── FoodItem.java
├── Pizza.java
├── Burger.java
├── Salad.java
├── Soda.java
├── ShoppingCart.java
├── Order.java
└── README.md


