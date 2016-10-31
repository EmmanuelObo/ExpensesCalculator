package com.emmaobo.expensecalculator.pojo;


import com.emmaobo.expensecalculator.enums.Priority;

public class Item {

    private String name;
    private double value;
    Priority priority;

    public Item(String name, double value, String priority)
    {
        setName(name);
        setValue(value);

        if(priority.equalsIgnoreCase("H"))
            setPriority(Priority.HIGH);

        if(priority.equalsIgnoreCase("M"))
            setPriority(Priority.MEDIUM);

        if(priority.equalsIgnoreCase("L"))
            setPriority(Priority.LOW);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
