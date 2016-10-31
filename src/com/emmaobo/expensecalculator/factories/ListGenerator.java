package com.emmaobo.expensecalculator.factories;


import com.emmaobo.expensecalculator.pojo.PersonalList;

import java.math.BigDecimal;

public class ListGenerator {

    public static PersonalList generateList(boolean hasBudget)
    {
        return new PersonalList(hasBudget);
    }
    public static PersonalList generateList(boolean hasBudget, BigDecimal budget)
    {
        return new PersonalList(hasBudget, budget);
    }
}
