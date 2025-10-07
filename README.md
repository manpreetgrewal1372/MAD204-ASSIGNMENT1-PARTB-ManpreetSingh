# MAD204-ASSIGNMENT1-PARTB-ManpreetSingh
This is the Android app for the People Introduction assignment.   It takes name, age, and program input, validates them, and displays an introduction message.
# MAD204 - Assignment 1 (Part B)
**Course:** F2025 MAD204-01 Java Development for MA  
**Student Name:** Manpreet Singh  
**Student ID:** A00198842  
**Assignment Title:** People Introduction Android App  
**Date of Submission:** October 6, 2025  

---

## 📱 Project Overview
This Android application is a simple **People Introduction App** developed using **Java** in **Android Studio**.  
It demonstrates basic Android development concepts such as **layouts, widgets, event handling, input validation, and theming.**

---

## 🎯 Objective
The main goal of this app is to:
- Collect user information (Name, Age, Program)
- Validate input values
- Display an introduction message in a TextView when the “Introduce Me” button is clicked
- Show error messages when invalid or empty inputs are entered

---

## ⚙️ Features
- **ConstraintLayout UI Design**  
- **EditText fields** for Name, Age, and Program  
- **Button** to trigger introduction logic  
- **TextView** to display user output  
- **Input validation** for empty fields and invalid age  
- **Custom colors and theme styles**

---

## 🧠 Technologies Used
- **Language:** Java  
- **IDE:** Android Studio  
- **UI Framework:** ConstraintLayout  
- **Version Control:** Git + GitHub  

---

## 💡 How It Works
1. User enters their **Name**, **Age**, and **Program**.
2. Presses the **“Introduce Me”** button.
3. The app validates the inputs:
   - If valid: Displays `"Hi, my name is [Name], I am [Age] years old and enrolled in [Program]."`
   - If invalid: Displays an appropriate error message.

---

## 🖌️ Theming and Styling
The app uses a customized **color theme**:
- Primary color: Deep Blue (`#3949AB`)
- Text color: Dark Gray (`#212121`)
- Button styled with white text and rounded edges.

---

## 🧪 Testing
### Valid Case:
- **Input:** Name: "Manpreet", Age: 22, Program: "Mobile App Development"  
- **Output:** "Hi, my name is Manpreet, I am 22 years old and enrolled in Mobile App Development."

### Invalid Case:
- **Input:** Name: "", Age: -1, Program: ""  
- **Output:** "Please enter valid details."

---

## 🗂️ GitHub Workflow
This project follows the assignment’s **GitHub submission standards**:
- Multiple commits with descriptive messages  
- Three pull requests representing logical updates:
  1. UI Text Update  
  2. Validation Logic Update  
  3. Theme Color Update  

---

## 🧾 File Information
| File | Description |
|------|--------------|
| `MainActivity.java` | Handles input validation and output display logic |
| `activity_main.xml` | Defines the user interface layout |
| `themes.xml` | Customizes the app’s look and feel |
| `README.md` | Documentation file for the project |
