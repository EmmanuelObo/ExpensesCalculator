package com.emmaobo.expensecalculator;


public class Calculator{
    private final double TITHE = .10;
    private double total = 0;

    public Calculator()
    {
        //TODO : Add GUI (last step of project)
    }

    void addExpense(double cost)
    {
        total += cost;
    }

    void subtractExpense(double cost)
    {
        total -= cost;
    }

    double calcTithe(double cost)
    {
        return cost*TITHE;
    }

    double getTotal()
    {
        return Math.round(total * 100.0) / 100.0;

    }

    void clear()
    {
        total = 0;
    }


}
