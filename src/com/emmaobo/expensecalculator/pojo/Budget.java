package com.emmaobo.expensecalculator.pojo;

import com.emmaobo.expensecalculator.interfaces.BudgetTracker;

import java.math.BigDecimal;

public class Budget implements BudgetTracker {

    private BigDecimal budget;
    public Budget(){
    }

    public Budget(BigDecimal budget){
        setBudget(budget);
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
    public void clear()
    {
        budget = new BigDecimal("0");
    }

}
