# AI Usage Report

## AI Tool Used

ChatGPT

## Purpose

AI assistance was used for:

* Spring Boot project setup
* REST API development
* CSV import implementation
* H2 database configuration
* Documentation preparation
* Debugging and troubleshooting

---

## Example 1

### AI Suggestion

Used methods:

* getTitle()
* getCategory()

### Problem

The Expense entity did not contain these fields.

### How It Was Caught

Compilation failed with "cannot find symbol" errors.

### Fix

Updated the service layer to use actual entity fields:

* date
* description
* paidBy
* amount
* currency
* splitType
* splitWith
* splitDetails
* notes

---

## Example 2

### AI Suggestion

Directly parse amount values.

### Problem

CSV contained values such as:

1,200

which caused NumberFormatException.

### How It Was Caught

CSV import failed during execution.

### Fix

Removed commas before converting values to Double.

---

## Example 3

### AI Suggestion

Used an incorrect CSV path.

### Problem

Application returned:

"The system cannot find the file specified"

### How It Was Caught

CSV import endpoint failed.

### Fix

Updated the file path to:

D:/Expenses Export (2).csv

---

## Human Verification

All generated code was reviewed, tested, and corrected before use.

## Conclusion

AI was used as a development assistant, while all implementation decisions, debugging, testing, and validation were performed manually.
