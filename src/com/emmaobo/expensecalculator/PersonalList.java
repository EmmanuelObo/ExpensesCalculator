package com.emmaobo.expensecalculator;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class PersonalList extends ExpensesList {

    private ListReader listReader;
    private ListWriter listWriter;

    public PersonalList(String filename) throws IOException
    {
        listReader = new ListReader(filename);
        listWriter = new ListWriter(filename);
    }


    @Override
    public void addItem(String item, double cost)
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
            printedList += "Item: " + pair.getKey() + " | " +"Price: " + pair.getValue() +"\n";
        }
        System.out.println(printedList);
    }

    @Override
    public void getTotal()
    {
        System.out.println("Total: " + calc.getTotal());
    }

    @Override
    public void save()
    {
        //TODO : save the current list (implement Serializable)
    }

    @Override
    public void restore()
    {
        //TODO : restore the saved list (Deserialization)
    }
}
