# Item API – Sample Java Backend Application

This is a simple Spring Boot RESTful API for managing items, similar to an e-commerce platform like Flipkart.

## Features
- Add new items
- Retrieve items by ID
- In-memory data storage using ArrayList
- Input validation using Spring Validation

## Technologies Used
- Java 17
- Spring Boot
- REST API
- Maven

## How to Run
1. Clone the project
2. Make sure Java 17+ and Maven are installed
3. Run the application:
   mvn spring-boot:run
4. Application starts on:
   http://localhost:8080

## API Endpoints

### Add Item
POST /api/items

Request Body:
{
"name": "Laptop",
"description": "Gaming Laptop",
"price": 75000
}

### Get Item by ID
GET /api/items/{id}

Example:
GET /api/items/1

## Notes
- Data is stored in memory and resets when the application restarts
- Validation ensures required fields are provided
