# Event System - Domain Model & ORM Challenge

This project is a back-end application developed with **Java** and **Spring Boot** to demonstrate expertise in Domain Modeling and Object-Relational Mapping (ORM). The system manages information for participants and activities in an academic event.

## Technologies
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- Maven

## Features
- **Conceptual Model Implementation**: Transformation of a class diagram into a physical database schema.
- **ORM Mapping**: Implementation of One-to-Many and Many-to-Many relationships using JPA annotations.
- **Database Seeding**: Automatic population of the H2 database with provided event data (participants, activities, categories, and time blocks).

## Domain Model
The system is built upon the following core entities:
- **Participant (Participante)**: Stores participant data (name and email).
- **Activity (Atividade)**: Represents event activities (lectures, workshops) with name, description, and price.
- **Category (Categoria)**: Classifies activities (e.g., "Course", "Workshop").
- **Block (Bloco)**: Defines specific time slots (start and end times) for activities.

## Technical Implementation
- **Many-to-Many Relationship**: Managed between `Participant` and `Activity` to track attendance.
- **One-to-Many Relationship**: Managed between `Category` and `Activity`, and between `Activity` and `Block`.
- **Instant Mapping**: Date and time values are mapped using the `Instant` class for UTC standard compliance.

## How to Run
1. Clone the repository:
   git clone https://github.com/Edu-Paz/event-system-challenge.git

2. Navigate to the project folder:
   cd event-system-challenge

3. Run the application:
   ./mvnw spring-boot:run

4. Access the H2 Console to verify tables and data:
   URL: http://localhost:8080/h2-console
   - JDBC URL: jdbc:h2:mem:testdb
   - User: sa
   - Password: (empty)

## License
This project is for educational purposes as part of the DevSuperior Bootcamp.
