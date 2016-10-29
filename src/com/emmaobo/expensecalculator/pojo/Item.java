package com.emmaobo.expensecalculator.pojo;


public class Item {

    private String name;
    private double value;

    //TODO : Add priority field

    public Item(String name, double value)
    {
        setName(name);
        setValue(value);
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
}
