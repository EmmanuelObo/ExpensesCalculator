package com.emmaobo.expensecalculator.pojo;


import java.math.BigDecimal;

public class Calculator{
    private final String ZERO = "0";
    private final BigDecimal TITHE = new BigDecimal(".10");
    private BigDecimal total;
    private String errorMsg;

    public Calculator()
    {
        total = new BigDecimal(ZERO);
    }

    public void addExpense(BigDecimal cost)
    {
        if(cost.compareTo(new BigDecimal(ZERO)) == -1)
        {
            errorMsg = "Cannot have negative costs";
            System.out.println(errorMsg);
            //TODO: might want to use an exception
        }
        else
            total = total.add(cost);
    }

    public void subtractExpense(BigDecimal cost)
    {
        if(cost.compareTo(new BigDecimal(ZERO)) == -1)
        {
            errorMsg = "Cannot have negative costs";
            System.out.println(errorMsg);
            //TODO: might want to use an exception
        }
        else
            total = total.subtract(cost);
    }

    public BigDecimal calcDifference(BigDecimal expenses, BigDecimal budget)
    {
        return budget.subtract(expenses);
    }

    public BigDecimal calcTithe(BigDecimal cost)
    {
        return cost.multiply(TITHE);
    }

    public BigDecimal getTotal()
    {
        return total;
    }

    public void clear()
    {
        total = new BigDecimal(ZERO);
    }


}
