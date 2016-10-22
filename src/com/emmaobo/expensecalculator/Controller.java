package com.emmaobo.expensecalculator;

import java.util.Scanner;

public class Controller{

    private final boolean INFINITE = true;
    private PersonalList list;
    private Scanner input;

    public Controller(PersonalList list)
    {
        input = new Scanner(System.in);
        this.list = list;
    }

    void control()
    {
        String prompt;
        menu();
        while(INFINITE)
        {
            prompt = input.next();
            if(prompt.equals("1"))
            {
                System.out.println("Enter item: ");
                String item = input.next();
                System.out.println("Enter cost: ");
                double cost = input.nextDouble();
                list.addItem(item, cost);
            }

            else if (prompt.equals("2"))
            {
                System.out.println("Enter item to delete: ");
                String item = input.next();
                list.removeItem(item);
            }

            else if (prompt.equals("3"))
            {
                list.showList();
            }

            else if(prompt.equals("4"))
            {
            }

            else if(prompt.equals("5"))
                break;
        }
    }

    void menu()
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