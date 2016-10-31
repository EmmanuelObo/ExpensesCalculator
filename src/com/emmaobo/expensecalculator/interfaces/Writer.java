package com.emmaobo.expensecalculator.interfaces;

import com.emmaobo.expensecalculator.pojo.Budget;

import java.math.BigDecimal;
import java.util.HashMap;

public interface Writer {
    void writeList(HashMap<String, BigDecimal> list);
}
