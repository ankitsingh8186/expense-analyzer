# Scope and Anomaly Log

## Project Scope

The objective of this project is to ingest shared expense data from a CSV file, store it in a database, and provide APIs for querying and analyzing expenses.

## Database Schema

Table: expenses

Fields:

* id
* amount
* currency
* date
* description
* paid_by
* split_type
* split_with
* split_details
* notes

## CSV Import Scope

The application imports records from a CSV file using OpenCSV and stores them in an H2 database.

## Data Validation

The following validations are performed:

* Amount must be numeric
* Empty optional fields are allowed
* Invalid rows are skipped or logged

## Anomalies Found

### Anomaly 1

Amount values contained commas.

Example:

1,200

Handling:

Commas were removed before converting to Double.

### Anomaly 2

Missing Notes field.

Handling:

Stored as NULL.

### Anomaly 3

Missing Split Details.

Handling:

Stored as NULL.

### Anomaly 4

Duplicate descriptions.

Handling:

Allowed because different transactions may share the same description.

## Import Statistics

Total Imported Records: 42

## Future Enhancements

* Category Summary API
* Total Expense API
* Anomaly Detection API
* Deployment to Cloud
