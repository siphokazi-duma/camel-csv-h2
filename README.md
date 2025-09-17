# Camel CSV to H2 Spring Boot Project

This project is a simple and elegant Spring Boot application built with Java 11 and Maven. It demonstrates how to use Apache Camel with Bindy to read and process CSV files, persist the data to an H2 in-memory database, and expose RESTful endpoints for interaction. The project also includes Swagger documentation and Docker support.

## 🚀 Features
- Spring Boot (Java 11)
- Apache Camel with Bindy for CSV parsing
- H2 in-memory database
- REST API endpoints
- Swagger/OpenAPI documentation
- Docker containerization
- JUnit testing

## 📁 CSV Format
The application expects a CSV file with the following format:

```csv
id,firstName,lastName,email
1,John,Doe,john.doe@example.com
2,Jane,Smith,jane.smith@example.com
```

## 📦 Running the Application

### Using Maven
```bash
mvn spring-boot:run
```

### Using Docker
```bash
docker build -t camel-csv-h2 .
docker run -p 8080:8080 camel-csv-h2
```

## 🔗 API Endpoints
- `GET /api/persons` - Retrieve all persons
- `POST /api/persons` - Add a new person

## 📘 Swagger UI
Access the Swagger documentation at:
```
http://localhost:8080/swagger-ui.html
```

## 🧪 Testing
Run unit tests with:
```bash
mvn test
```

## 🛠️ Technologies Used
- Java 11
- Spring Boot
- Apache Camel
- Bindy
- H2 Database
- Swagger (Springdoc OpenAPI)
- Docker
- JUnit
