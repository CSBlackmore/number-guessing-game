# 🎯 Guessing Game - Java CLI

A simple command-line number guessing game developed in **Java 17**.
This project focuses on applying core backend fundamentals such as input validation, exception handling, and separation of responsibilities using an object-oriented approach.

---

## ✨ Features

* 🧠 **Interactive Game Logic**
  The system generates a random number between 1 and 100 and provides dynamic hints ("higher" / "lower") based on user input.

* 🛡️ **Input Validation & Error Handling**
  User input is validated using exception handling (`InputMismatchException`) and additional checks (e.g., empty input, excessive length), ensuring the application remains stable under invalid input scenarios.

* 🔄 **Replay System**
  Players can restart the game without restarting the application. Each session resets the secret number and attempt counter.

* ⚙️ **Controlled Input Flow**
  Proper handling of `Scanner` input buffer when switching between numeric and string inputs to prevent common input issues.

---

## 🏗️ Project Structure

The project is organized to separate concerns and improve maintainability:

* **Main**
  Entry point of the application. Responsible for initializing and coordinating the game flow.

* **Game**
  Contains the core game logic, including number generation, attempt tracking, and win/lose conditions.

* **Player (optional if implemented)**
  Stores player-related data such as name and session state.

* **InputHandler (or equivalent logic)**
  Manages user input, validation, and error handling.

---

## 🛠️ Technologies

* **Language:** Java 17
* **Standard Libraries:**

    * `java.util.Scanner`
    * `java.util.Random`
    * `java.util.InputMismatchException`

---

## 🚀 How to Run

1. Compile the project:

   ```
   javac Main.java
   ```

2. Run the application:

   ```
   java Main
   ```

---

## 📌 Learning Goals

This project was built to strengthen:

* Control flow and conditional logic
* Exception handling in Java
* Input validation strategies
* Basic object-oriented design and separation of responsibilities
* CLI-based user interaction

---

## 📈 Possible Improvements

* Persist game history (file or database)
* Add difficulty levels (e.g., different ranges or attempts)
* Implement unit testing
* Refactor into a more scalable architecture

---

## 🤝 Author

Developed as part of backend practice and preparation for junior developer roles.