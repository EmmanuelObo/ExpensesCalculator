package com.emmaobo.expensecalculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class CalculatorTest {

    private Calculator calc;
    private Calculator spyCalc;
    private double mockCost = 5.99;
    private double negativeCost = -4.99;

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
        double resultant = 10.00;
        double amount = 100;
        String msg = "Incorrect calculations.";
        assertEquals(resultant, calc.calcTithe(amount), 0);
    }

    @Test
    public void testCalcTithe()
    {
        double amount = 100.00;
        double result = 10.00;
        calc.calcTithe(amount);
        when(spyCalc.calcTithe(amount)).thenReturn(result);
    }

    @Test
    public void testClear()
    {
        spyCalc.clear();
        verify(spyCalc).clear();
    }

}
