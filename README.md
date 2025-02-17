# Swagger API Documentation

Simple API project with Swagger integration for documentation and testing.

## Setup Instructions

To get started with this project, follow these steps:

1. **Clone the repository**:
- git clone <repository_url>
- cd <project_directory>

2. **Prerequisites**:
- Java Development Kit (JDK) 11 or higher
- Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA
- MySQL Server 9.0
- MySQL Workbench (optional, for database management)

3. **Database Setup**:
- Create a database named `registration`.

- Create table named `users`
    CREATE TABLE Users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username NVARCHAR(50) NOT NULL UNIQUE,
    password NVARCHAR(255) NOT NULL,
    email NVARCHAR(255) NOT NULL UNIQUE
    );

- Update `application.properties` with your database configuration:
  
  spring.datasource.url=jdbc:mysql://localhost:3306/registration
  spring.datasource.username=<your_database_username>
  spring.datasource.password=<your_database_password>
  springdoc.api-docs.path=/api-docs
  springdoc.swagger-ui.path=/swagger-ui.html  

4. **Running the Application**:
- Build and run the application using your IDE. (Run As Spring boot application)

5. **Usage**:
- Open your browser and `http://localhost:8080` to access the application.
- http://localhost:8080/swagger-ui/index.html

## Author
Shravani Mahendrakar (@shravanimahendrakar)
