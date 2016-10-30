package com.emmaobo.expensecalculator.interfaces;

import com.emmaobo.expensecalculator.pojo.Calculator;

import java.math.BigDecimal;
import java.util.HashMap;

public abstract class ExpensesList {
    protected Calculator calc;
    protected HashMap<String, BigDecimal> list;
    public ExpensesList()
    {
        calc = new Calculator();
        list = new HashMap<String, BigDecimal>();
    }

    public abstract void addItem(String item, BigDecimal cost);
    public abstract void removeItem(String item);
    public abstract void showList();
    public abstract void getTotal();
    public abstract void save();
    public abstract void restore();

}
