# Decision Log

## Decision 1: Spring Boot

Options Considered:

* Core Java
* Spring Boot

Chosen:

* Spring Boot

Reason:
Provides REST API support, dependency injection, and rapid development.

---

## Decision 2: H2 Database

Options Considered:

* MySQL
* PostgreSQL
* H2

Chosen:

* H2

Reason:
Lightweight, easy setup, and suitable for assignment development.

---

## Decision 3: OpenCSV

Options Considered:

* Manual CSV Parsing
* OpenCSV

Chosen:

* OpenCSV

Reason:
Simple and reliable CSV processing.

---

## Decision 4: Repository Pattern

Options Considered:

* JDBC
* Spring Data JPA

Chosen:

* Spring Data JPA

Reason:
Reduces boilerplate code and improves maintainability.

---

## Decision 5: REST Architecture

Options Considered:

* Desktop Application
* REST APIs

Chosen:

* REST APIs

Reason:
Easy integration and testing.

---

## Decision 6: CSV Import Service

Chosen:
Separate CsvImportService

Reason:
Keeps CSV logic isolated from controller and service layers.
