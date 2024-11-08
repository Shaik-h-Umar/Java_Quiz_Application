# Interactive Quiz Application

## Introduction
The Interactive Quiz Application is a GUI-based quiz system developed in Java that allows users to test their knowledge on various subjects through a series of timed multiple-choice questions. Users can log in to the application, view quiz rules, and attempt questions with a 15-second timer for each. A 50-50 lifeline is available to help narrow down answer choices.

## Table of Contents
- [Project Overview](#project-overview)
- [Demo](#demo)
- [Key Features](#key-features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)

## Project Overview
This Java-based quiz application provides a user-friendly interface for conducting quizzes. Users can log in, view quiz rules, and answer timed questions. The app includes features like a 50-50 lifeline, ensuring an engaging and interactive experience.

## Demo

Here are some screenshots of the Interactive Quiz Application:

### Login Page
![Login Page](src/Mainn/Images/Working/Login%20Page.png)

### Rules Page
![Rules Page](src/Mainn/Images/Working/Rules%20Page.png)

### Quiz Page
![Quiz Page](src/Mainn/Images/Working/Quiz%20Page.png)

### Quiz Page After Using 50-50 Lifeline
![Quiz Page After Using 50-50 Lifeline](src/Mainn/Images/Working/Quiz%20Page%20after%20using%2050-50%20Life%20line.png)

### Score Page
![Score Page](src/Mainn/Images/Working/Score%20Page.png)

### Database Schema
![Database Schema](src/Mainn/Images/Working/Database%20Schema.png)

### Database Values After Login
![Values Transferred to Database After Login](src/Mainn/Images/Working/Values%20that%20are%20transferred%20into%20the%20Database%20after%20login.png)


## Key Features
- **User Authentication**: Users must log in to start the quiz.
- **Timed Questions**: Each question has a 15-second timer. If the time runs out, the question is automatically skipped.
- **50-50 Lifeline**: A lifeline option that removes two incorrect options, which can be used only once per quiz.
- **Score Tracking**: Users' scores are tracked based on correct answers.

## Technologies Used
- **Java**: `21.0.5` (LTS version for backend logic and GUI development)
- **OJDBC**: `OJDBC11.jar` for database connectivity to Oracle
- **Java Swing and AWT**: For GUI components and design
- **Oracle Database**: For storing user credentials and quiz data

## Setup and Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Shaik-h-Umar/Java_Quiz_Application.git

## Download Dependencies

- Make sure you have Java version 21 installed.
- Download `OJDBC11.jar` for Oracle database connectivity and add it to your project libraries.

## Database Setup

1. Set up an Oracle database with tables for user credentials and quiz questions.
2. Configure the JDBC connection in the application with your Oracle database credentials.

## Run the Application

1. Compile and run the project using your preferred IDE or Java compiler.

## Usage

### Login

- Users log in with their credentials. If the user is new, registration can be completed (if implemented in the app).

### Viewing Rules

- After login, users are directed to a rules page that explains the quiz format and usage of the 50-50 lifeline.

### Starting the Quiz

- Users start the quiz, where each question appears with four answer options.
- The user has 15 seconds per question. If time expires, the question is skipped.
- Users can use the 50-50 lifeline once during the quiz to eliminate two incorrect options.

### Quiz Completion

- At the end of the quiz, the user’s score is displayed based on the number of correct answers.

## Future Enhancements

- **Question Bank Expansion**: Adding more questions across different subjects or difficulty levels.
- **Leaderboards**: Displaying top scores for competitive aspects.
- **Multiplayer Mode**: Allowing multiple users to participate in the quiz simultaneously.
- **Improved Analytics**: Providing feedback on performance after each quiz.

## Contributing

We welcome contributions to improve this project. Please feel free to fork this repository, make your changes, and submit a pull request.
