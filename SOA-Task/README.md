# Ticket Management System

Spring Boot 3.3.5 REST API for the SKILL exam requirement (ID: 2400030159).

## Stack
- Java 21
- Spring Boot Web, Spring Data JPA, Hibernate
- PostgreSQL
- Swagger UI / OpenAPI

## Configure database
Create a PostgreSQL database named `skill_exam_2400030159`. Update `src/main/resources/application.properties` with your PostgreSQL username/password if they differ from the defaults.

Default application port: `2006`.

## Run
```bash
./mvnw spring-boot:run
```
On Windows:
```bat
mvnw.cmd spring-boot:run
```

Swagger UI: `http://localhost:2006/swagger-ui/index.html`

## API endpoints
Base path: `/ticket`

| Method | Endpoint | Operation |
|---|---|---|
| POST | `/ticket/insert` | Insert ticket |
| PUT | `/ticket/update/{id}` | Update ticket |
| DELETE | `/ticket/delete/{id}` | Delete ticket |
| GET | `/ticket/displayall` | Display all tickets |
| GET | `/ticket/display/{id}` | Display ticket by ID |
| GET | `/ticket/findByName/{name}` | Find tickets by name |
| GET | `/ticket/findByType/{type}` | Find tickets by type |

## Sample JSON
```json
{
  "name": "Network Issue",
  "type": "Technical",
  "status": "Open",
  "location": "Block A"
}
```

`ticketId`, `createdAt`, and `updatedAt` are generated/managed by the application. Do not send them when inserting a ticket.
