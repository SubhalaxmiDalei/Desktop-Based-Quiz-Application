# 👁️ Desktop-Based Quiz Application

A Java Swing-based interactive quiz application designed for desktop environments. This project provides a user-friendly interface for conducting timed multiple-choice quizzes, featuring login authentication, lifeline options, scoring logic, and a replay system.

---

## 📋 Features

### ✅ Login System

- A secure and simple login interface to identify participants before the quiz begins.
- Validates user input to ensure a clean quiz experience.

### ⏳ Timed Questions

- Each question is timed (e.g., 15 seconds), adding urgency and real-time pressure to simulate test conditions.
- Automatically advances or penalizes unanswered questions when the timer runs out.

### 🎯 50-50 Lifeline

- Players can use a single-use **50-50 lifeline** that eliminates two incorrect options, making it easier to choose the right answer.
- Integrated with the quiz logic and disables after one use.

### 📁 Rules Screen

- Before the quiz starts, users are shown a clear and concise **Rules Page** explaining:
  - Number of questions
  - Time per question
  - Use of lifeline
  - Scoring system

### 🧪 Quiz Core

- Questions are displayed one-by-one with four options.
- Selection is locked per question after submission.
- Score is calculated based on correct answers.
- Immediate feedback shown after the quiz ends.

### 🏑 Final Score Summary

- At the end of the quiz, the app displays:
  - Total correct answers
  - Final score
  - Option to **Play Again** or **Exit**

### 🔄 Replay Feature

- After completing a quiz, users can choose to **Play Again** to restart the session without closing the application.

---

## 💽 Technologies Used

- **Java SE**
- **Swing/AWT** for GUI
- **Object-Oriented Programming (OOP)** principles

---

## 📂 Project Structure (Example)

```
Desktop-Based-Quiz-Application/
├── src/
│   ├── main/
│   │   ├── Login.java
│   │   ├── Rules.java
│   │   ├── Quiz.java
│   │   ├── Score.java
│   │   └── Main.java
├── assets/
│   └── images, icons, etc.
├── README.md
```

---

## 🚀 How to Run

1. **Clone the Repository**

   ```bash
   git clone https://github.com/SubhalaxmiDalei/Desktop-Based-Quiz-Application.git
   ```

2. **Compile the Code**

   ```bash
   javac -d bin src/*.java
   ```

3. **Run the Application**

   ```bash
   java -cp bin Main
   ```

> Ensure you're using **Java 8 or later** and have a standard JDK installed.

---

## 🛠️ Future Improvements

- Load questions from an external file or database
- Add user profile and result history tracking
- Enhance UI with animations and themes
- Implement leaderboard system for competitive quizzing

---

## 📜 License

This project is open-source and available under the [MIT License](LICENSE).

