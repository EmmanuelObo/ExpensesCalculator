package com.emmaobo.expensecalculator;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ControllerTest {

    private PersonalList mockList;
    private Controller mockController;

    @Before
    public void init()
    {
        mockList = new PersonalList();
        mockController = new Controller(mockList);
    }

    @Test
    public void testControllerNotNull()
    {
        assertNotNull(mockController);
    }




}
