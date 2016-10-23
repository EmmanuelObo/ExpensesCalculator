package com.emmaobo.expensecalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller{

    private boolean running = true;
    private final String FIRST = "1";
    private final String SECOND = "2";
    private final String THIRD = "3";
    private final String FOURTH = "4";
    private final String FIFTH = "5";
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
        while(running) {
            menu();
            prompt = input.next();
            if (prompt.equals(FIRST))
                {
                System.out.println("Enter item: ");
                String item = input.next();
                System.out.println("Enter cost: ");
                double cost = input.nextDouble();
                list.addItem(item, cost);
                }
            else if (prompt.equals(SECOND))
                {
                System.out.println("Enter item to delete: ");
                String item = input.nextLine();
                list.removeItem(item);
                }
            else if (prompt.equals(THIRD))
                {
                list.showList();
                }
            else if (prompt.equals(FOURTH))
              {
                  list.save();
              }
            else if (prompt.equals(FIFTH))
                running = false;

            else
                System.out.println("Invalid input, please try again");
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