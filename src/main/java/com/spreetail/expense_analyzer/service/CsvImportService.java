package com.spreetail.expense_analyzer.service;

import com.opencsv.CSVReader;
import com.spreetail.expense_analyzer.entity.Expense;
import com.spreetail.expense_analyzer.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.util.List;

@Service
public class CsvImportService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public String importCsv(String filePath) {

        try {
            CSVReader reader = new CSVReader(new FileReader(filePath));

            List<String[]> records = reader.readAll();

            records.remove(0); // Skip Header

            for (String[] row : records) {

                Expense expense = new Expense();

                expense.setDate(row[0]);
                expense.setDescription(row[1]);
                expense.setPaidBy(row[2]);

                // Fix Amount with commas like 1,200
                expense.setAmount(
                        Double.parseDouble(row[3].replace(",", "")));

                expense.setCurrency(row[4]);
                expense.setSplitType(row[5]);
                expense.setSplitWith(row[6]);
                expense.setSplitDetails(row[7]);
                expense.setNotes(row[8]);

                expenseRepository.save(expense);
            }

            reader.close();

            return "CSV Imported Successfully";

        } catch (Exception e) {
            return e.getMessage();
        }
    }
}