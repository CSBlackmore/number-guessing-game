# Number Guessing Game - Java CLI Implementation

A command-line interface (CLI) application developed in Java 17 that demonstrates core backend fundamentals, specifically focusing on input validation, robust exception handling, and the separation of concerns through Object-Oriented Programming (OOP).

## Core Features

- **Dynamic Game Logic:** Generates a random integer within a defined range (1-100) and provides real-time feedback (higher/lower) based on user attempts.
- **Robust Error Handling:** Utilizes `InputMismatchException` and custom validation checks to ensure application stability against invalid user inputs (e.g., non-numeric strings, empty inputs).
- **Session Management:** Includes a replay system that resets the game state, secret number, and attempt counters without requiring an application restart.
- **Input Buffer Optimization:** Precise management of the `Scanner` buffer to handle transitions between numeric and string inputs effectively.

## Architecture and Design

The project follows a modular structure to promote maintainability:
- **Main:** Application entry point and flow coordination.
- **Game Engine:** Core logic, random number generation, and state tracking.
- **Input Handler:** Dedicated logic for data sanitization and validation.

## Technical Specifications

- **Language:** Java 17
- **Standard Libraries used:** `java.util.Scanner`, `java.util.Random`, `java.util.InputMismatchException`.

## Learning Objectives Achieved

- Implementation of control flow and conditional logic.
- Mastery of Java Exception Handling.
- Application of Object-Oriented Design principles (Separation of Concerns).
- CLI-based User Experience (UX) design.

## Author
Developed as part of professional Back-End development practice and portfolio building.