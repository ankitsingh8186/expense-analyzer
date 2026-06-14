package com.spreetail.expense_analyzer.controller;

import com.spreetail.expense_analyzer.entity.Expense;
import com.spreetail.expense_analyzer.service.CsvImportService;
import com.spreetail.expense_analyzer.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private CsvImportService csvImportService;

    // Create Expense
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }

    // Get All Expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    // Get Total Expense
    @GetMapping("/total")
    public Double getTotalExpense() {
        return expenseService.getTotalExpense();
    }

    // Update Expense
    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id,
                                 @RequestBody Expense expense) {
        return expenseService.updateExpense(id, expense);
    }

    // Delete Expense
    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return "Expense Deleted Successfully";
    }

    // Import CSV
    @PostMapping("/import")
    public String importCsv() {

        String filePath = "D:/Expenses Export (2).csv";

        return csvImportService.importCsv(filePath);
    }
}