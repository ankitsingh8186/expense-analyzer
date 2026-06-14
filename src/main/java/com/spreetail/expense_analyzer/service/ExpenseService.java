package com.spreetail.expense_analyzer.service;

import com.spreetail.expense_analyzer.entity.Expense;
import com.spreetail.expense_analyzer.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    // Save Expense
    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    // Get All Expenses
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    // Get Total Expense
    public Double getTotalExpense() {
        return expenseRepository.getTotalExpense();
    }

    // Update Expense
    public Expense updateExpense(Long id, Expense expense) {

        Expense existingExpense = expenseRepository.findById(id).orElse(null);

        if (existingExpense != null) {

            existingExpense.setDate(expense.getDate());
            existingExpense.setDescription(expense.getDescription());
            existingExpense.setPaidBy(expense.getPaidBy());
            existingExpense.setAmount(expense.getAmount());
            existingExpense.setCurrency(expense.getCurrency());
            existingExpense.setSplitType(expense.getSplitType());
            existingExpense.setSplitWith(expense.getSplitWith());
            existingExpense.setSplitDetails(expense.getSplitDetails());
            existingExpense.setNotes(expense.getNotes());

            return expenseRepository.save(existingExpense);
        }

        return null;
    }

    // Delete Expense
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}