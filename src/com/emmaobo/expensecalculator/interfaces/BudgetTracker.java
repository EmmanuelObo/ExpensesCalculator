package com.emmaobo.expensecalculator.interfaces;

import java.math.BigDecimal;

public interface BudgetTracker
{
    void setBudget(BigDecimal budget);
    BigDecimal checkBudget();
    void clear();
}
