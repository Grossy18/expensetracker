package com.example.expensetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity  // No @Table annotation, default table name 'expense'
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;  // Default column name 'description'

    private BigDecimal amount;   // Default column name 'amount'

    // No-argument constructor for JPA
    public Expense() {}

    // Constructor for easier object creation
    public Expense(String description, BigDecimal amount) {
        this.description = description;
        this.amount = amount;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return "Expense{id=" + id + ", description='" + description + "', amount=" + amount + "}";
    }
}
