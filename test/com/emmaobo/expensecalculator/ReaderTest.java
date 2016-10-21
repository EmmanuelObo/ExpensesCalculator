package com.emmaobo.expensecalculator;

import org.junit.*;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReaderTest {
    private String mockFilename = "filename";
    private ListReader listReader;
    private ListReader spyReader;


    @Before
    public void init() throws FileNotFoundException
    {
        listReader = new ListReader(mockFilename);
        spyReader = spy(listReader);
    }

    @Test
    public void testReaderNotNull() throws FileNotFoundException
    {
        assertNotNull(listReader);
    }
}
