package com.emmaobo.expensecalculator.pojo;

import com.emmaobo.expensecalculator.interfaces.BudgetTracker;

import java.math.BigDecimal;

public class Budget implements BudgetTracker {

    private BigDecimal budget;
    private boolean hasBudget;

    public Budget(){
    }

    public Budget(BigDecimal budget){
        setBudget(budget);
        hasBudget = true;
    }

    @Override
    public void setBudget(BigDecimal budget)
    {
        this.budget = budget;
    }

    @Override
    public BigDecimal checkBudget() {
        return budget;
    }

    @Override
    public boolean hasBudget() {
        return this.hasBudget;
    }

    @Override
    public void turnOff()
    {
        hasBudget = false;
    }

    @Override
    public void turnOn()
    {
        hasBudget = true;
    }
}
