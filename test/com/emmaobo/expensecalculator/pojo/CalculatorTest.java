package com.emmaobo.expensecalculator.pojo;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    private Calculator calc;
    private Calculator spyCalc;
    private BigDecimal mockCost = new BigDecimal("5.99");
    private BigDecimal negativeCost = new BigDecimal("-4.99");

    @Before
    public void init()
    {
        calc = new Calculator();
        spyCalc = spy(calc);
    }

    @Test
    public void testCalcNotNull()
    {
        assertNotNull(calc);
    }

    @Test
    public void testAddExpense()
    {
        spyCalc.addExpense(mockCost);
        verify(spyCalc).addExpense(mockCost);
    }

    @Test
    public void testAddNegativeValue()
    {
        spyCalc.addExpense(negativeCost);
        verify(spyCalc).addExpense(negativeCost);
    }

    @Test
    public void testSubtractNegativeValue()
    {
        spyCalc.subtractExpense(negativeCost);
        verify(spyCalc).subtractExpense(negativeCost);
    }

    @Test
    public void testGetTotal()
    {
        spyCalc.getTotal();
        when(spyCalc.getTotal()).thenReturn(mockCost);
    }

    @Test
    public void testCalcTitheResult()
    {
        BigDecimal resultant = new BigDecimal("10.00");
        BigDecimal amount = new BigDecimal("100");
        String msg = "Incorrect calculations.";
        assertEquals(resultant, calc.calcTithe(amount));
    }

    @Test
    public void testCalcTithe()
    {
        BigDecimal resultant = new BigDecimal("10.00");
        BigDecimal amount = new BigDecimal("100");
        calc.calcTithe(amount);
        when(spyCalc.calcTithe(amount)).thenReturn(resultant);
    }

    @Test
    public void testClear()
    {
        spyCalc.clear();
        verify(spyCalc).clear();
    }

}
