# Todos

Enterprise grade todo application built with Spring Boot.

## Tech Stack

- Java 21
- Spring Boot 4.0.1 (Web MVC, Data JPA)
- MySQL
- Maven

## Getting Started

### Prerequisites

- JDK 21
- MySQL running locally (or update `application.properties` to point elsewhere)

### Configuration

Database connection settings live in [src/main/resources/application.properties](src/main/resources/application.properties):

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
```

Update these to match your local MySQL credentials before running the app.

### Run

```bash
./mvnw spring-boot:run
```

The app starts on `http://localhost:8080` by default.

## API

Base path: `/api/v1/todos`

| Method | Endpoint | Description |
|--------|----------|--------------|
| POST   | `/api/v1/todos`      | Create a todo |
| GET    | `/api/v1/todos`      | List all todos |
| GET    | `/api/v1/todos/{id}` | Get a todo by id |
| PUT    | `/api/v1/todos/{id}` | Update a todo by id |
| DELETE | `/api/v1/todos/{id}` | Delete a todo by id |

### Request body (create/update)

```json
{
  "title": "string",
  "description": "string",
  "completed": false
}
```

## Project Structure

```
src/main/java/com/ptech/todo/
├── controller/    REST endpoints
├── service/       Business logic (ITodoService + impl)
├── repository/    Spring Data JPA repositories
├── entity/        JPA entities
├── dto/           Request/response DTOs
├── mapper/        Entity <-> DTO mapping
└── exception/     Custom exceptions and global exception handling
```
