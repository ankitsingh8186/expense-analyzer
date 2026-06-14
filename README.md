# Spreetail Shared Expense Analyzer

## Project Overview

This project is a Spring Boot based Shared Expense Analyzer developed as part of the Spreetail Assignment.

The application imports expense records from a CSV file, stores them in an H2 database, and provides REST APIs to manage and analyze expenses.

## Tech Stack

* Java 17
* Spring Boot 3
* Spring Data JPA
* H2 Database
* Maven
* OpenCSV

## Features

* Import expenses from CSV
* Store expenses in H2 database
* Create Expense API
* Read Expense API
* Update Expense API
* Delete Expense API
* Expense analysis support

## Project Structure

src/main/java

* controller
* service
* repository
* entity

src/main/resources

* application.properties

## API Endpoints

### Get All Expenses

GET /expenses

### Add Expense

POST /expenses

### Update Expense

PUT /expenses/{id}

### Delete Expense

DELETE /expenses/{id}

### Import CSV

POST /expenses/import

## Running the Project

1. Clone repository

2. Open project in VS Code

3. Run command:

mvn spring-boot:run

4. Open:

http://localhost:8080

5. H2 Console:

http://localhost:8080/h2-console

## Database

H2 In-Memory Database

Tables:

* expenses

## CSV Import

The application imports expense data from a CSV file and stores records into the expenses table.

Imported Records: 42

## AI Usage

AI assistance was used for:

* Project setup
* Debugging
* Documentation
* Code review

## Author

Ankit Singh
