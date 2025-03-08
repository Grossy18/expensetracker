package com.example.expensetracker.model;

import org.springframework.data.annotation.Id; // Import MongoDB-specific @Id annotation
import org.springframework.data.mongodb.core.mapping.Document; // Import MongoDB-specific @Document annotation

import java.math.BigDecimal;

@Document(collection = "expense") // Optional: specify collection name if not 'expense'
public class Expense {

    @Id
    private String id;

    private String description;

    private BigDecimal amount;

    // No-argument constructor for MongoDB
    public Expense() {
    }

    // Constructor for easier object creation
    public Expense(String description, BigDecimal amount) {
        this.description = description;
        this.amount = amount;
    }

    // Getters and Setters
    public String getId() { // Change id type to String
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    // Override toString for easy debugging
    @Override
    public String toString() {
        return "Expense{id='" + id + "', description='" + description + "', amount=" + amount + "}";
    }
}
