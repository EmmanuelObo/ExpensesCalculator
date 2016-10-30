package com.emmaobo.expensecalculator.pojo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ControllerTest {

    private com.emmaobo.expensecalculator.pojo.PersonalList mockList;
    private com.emmaobo.expensecalculator.pojo.Controller mockController;

    @Before
    public void init()
    {
        mockList = new com.emmaobo.expensecalculator.pojo.PersonalList();
        mockController = new com.emmaobo.expensecalculator.pojo.Controller(mockList);
    }

    @Test
    public void testControllerNotNull()
    {
        assertNotNull(mockController);
    }




}
