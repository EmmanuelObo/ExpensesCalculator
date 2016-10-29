package com.emmaobo.expensecalculator.pojo;


public class Calculator{
    private final double TITHE = .10;
    private double total = 0;
    private String errorMsg;

    public Calculator()
    {
        //TODO : Add GUI (last step of project)
    }

    public void addExpense(double cost)
    {
        if(cost < 0)
        {
            errorMsg = "Cannot have negative costs";
            System.out.println(errorMsg);
            //TODO: might want to use an exception
        }
        else
            total += cost;
    }

    public void subtractExpense(double cost)
    {
        if(cost < 0)
        {
            errorMsg = "Cannot have negative costs";
            System.out.println(errorMsg);
            //TODO: might want to use an exception
        }
        else
            total -= cost;
    }

    public double calcTithe(double cost)
    {
        return cost*TITHE;
    }

    public double getTotal()
    {
        return Math.round(total * 100.0) / 100.0;

    }

    public void clear()
    {
        total = 0;
    }


}
