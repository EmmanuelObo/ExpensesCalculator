package com.emmaobo.expensecalculator;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ListWriter implements Writer
{
    File file;
    private FileWriter fileWriter;
    private BufferedWriter writer;

    public ListWriter(String filename) throws IOException
    {
        file = new File(filename);
        if(!file.exists())
            file.createNewFile();
        fileWriter = new FileWriter(file);
        writer = new BufferedWriter(fileWriter);
    }

    @Override
    public void writeList(String item)
    {
        //TODO : Write list info to a file
    }
}
