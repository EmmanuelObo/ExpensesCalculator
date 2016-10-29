package com.emmaobo.expensecalculator.pojo;

public class Menu {

    public static void genMainMenu()
    {
        System.out.println("Welcome to The Expense Calculator.");
        System.out.println();
        System.out.println("Select one of the options from the list below");
        System.out.println("(1) Create a new list");
        System.out.println("(2) Load existing list");
        System.out.println("(3) Exit" );
        System.out.println();
    }

    public static void genListMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("(1) Add item");
        System.out.println("(2) Delete item");
        System.out.println("(3) Show List" );
        System.out.println("(4) Save" );
        System.out.println("(5) Exit" );
        System.out.println();
    }
}
