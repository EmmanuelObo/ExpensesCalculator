package com.emmaobo.expensecalculator;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ControllerTest {

    Controller mockController;

    @Before
    public void init()
    {
        mockController = new Controller();
    }

    @Test
    public void testControllerNotNull()
    {
        assertNotNull(mockController);
    }




}
