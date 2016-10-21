package com.emmaobo.expensecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;


public class PersonalListTest {

    private String mockItem = "item";
    private double mockValue = 1.00;
    private PersonalList mockList;
    private PersonalList spyList;

    @Before
    public void init()
    {
        mockList = new PersonalList();
        spyList = spy(mockList);
    }

    @Test
    public void listIsNotNull()
    {
        assertNotNull(mockList);
    }

    @Test
    public void testItemNameNotNull()
    {
        mockList.removeItem(null);
        String errorMsg = "String value cannot be null";
        //TODO : finish this test
    }

    @Test
    public void testRemoveItem()
    {
        spyList.removeItem(mockItem);
        verify(spyList).removeItem(mockItem);
    }
}
