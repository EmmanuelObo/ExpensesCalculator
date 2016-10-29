package com.emmaobo.expensecalculator.interfaces;

import com.emmaobo.expensecalculator.pojo.Calculator;

import java.util.HashMap;

public abstract class ExpensesList {
    protected Calculator calc;
    protected HashMap<String, Double> list;
    public ExpensesList()
    {
        calc = new Calculator();
        list = new HashMap<String, Double>();
    }

    public abstract void addItem(String item, double cost);
    public abstract void removeItem(String item);
    public abstract void showList();
    public abstract void getTotal();
    public abstract void save();
    public abstract void restore();

}
