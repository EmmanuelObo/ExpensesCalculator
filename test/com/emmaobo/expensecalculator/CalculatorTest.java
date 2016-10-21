package com.emmaobo.expensecalculator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;


public class CalculatorTest {

    Calculator calc;

    @Before
    public void init()
    {
        calc = new Calculator();
    }

    @Test
    public void testNull()
    {
        assertNotNull(calc);
    }

}
