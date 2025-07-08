# CaptureStudent

A Spring Boot REST API for managing student records using MongoDB.

## Features

- Create, read, update, and delete students
- Search students by name or ID
- RESTful endpoints
- MongoDB integration

## Technologies

- Java 17
- Spring Boot 3.5.3
- Spring Data MongoDB
- Maven

## Prerequisites

- Java 17+
- Maven
- MongoDB (local or MongoDB Atlas)

## Configuration

Set your MongoDB URI in `src/main/resources/application.properties`:

```
spring.data.mongodb.uri=mongodb+srv://<user>:<password>@<cluster>/<database>?retryWrites=true&w=majority</database></cluster></password></user>
```

## Build and Run

```
mvn clean install
mvn spring-boot:run
```
The API will be available at `http://localhost:8080`.

## API Endpoints

- `GET /students` — List all students
- `GET /students/{id}` — Get student by ID
- `GET /students/search/byName?name={name}` — Get student by name
- `POST /students` — Create a new student
- `PUT /students/{id}` — Update a student
- `DELETE /students/{id}` — Delete a student

## Project Structure

- `model/` — Student entity
- `repository/` — MongoDB repository interface
- `service/` — Business logic
- `controller/` — REST API endpoints

