package com.emmaobo.expensecalculator.filereader;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ListReader implements com.emmaobo.expensecalculator.interfaces.Reader {

    private FileReader fileReader;
    private BufferedReader reader;

    public ListReader(String filename) throws FileNotFoundException
    {
        fileReader = new FileReader(filename);
        reader = new BufferedReader(fileReader);
    }


    @Override
    public void readList() {

    }
}