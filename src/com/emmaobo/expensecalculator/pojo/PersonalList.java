package com.emmaobo.expensecalculator.pojo;

import com.emmaobo.expensecalculator.interfaces.ExpensesList;
import com.emmaobo.expensecalculator.filewriter.ListWriter;
import com.emmaobo.expensecalculator.filereader.ListReader;


import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PersonalList extends ExpensesList {

    private Scanner userInput;
    private ListReader listReader;
    private ListWriter listWriter;


    @Override
    public void addItem(String item, BigDecimal cost)
    {
        list.put(item, cost);
        calc.addExpense(cost);
        System.out.println("'" + item + "'" + " added to list.");
    }

    @Override
    public void removeItem(String item)
    {
        if(list.containsKey(item))
        {
            calc.subtractExpense(list.get(item));
            list.remove(item);
            System.out.println("Item " + "'" + item + "'" + " was successfully removed.");
        }
    }

    @Override
    public void showList()
    {
        Iterator it = list.entrySet().iterator();
        String printedList = "";
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            printedList += "Item: " + pair.getKey() + ", " +"Price: $" + pair.getValue() +"\n";
        }
        System.out.println(printedList);
        getTotal();
    }

    @Override
    public void getTotal()
    {
        System.out.println("Total: " + calc.getTotal());
    }

    @Override
    public void save()
    {
        userInput = new Scanner(System.in);
        System.out.println("Enter list name: ");
        String listname = userInput.nextLine();
        try {
            listWriter = new ListWriter(listname);
            listWriter.writeList(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void restore() {

    }
}
