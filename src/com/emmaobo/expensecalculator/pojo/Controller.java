package com.emmaobo.expensecalculator.pojo;

import java.math.BigDecimal;
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

    public void control()
    {
        String prompt;
        while(running) {
            Menu.genListMenu();
            try {
                prompt = input.next();
                if (prompt.equals(FIRST)) {
                    System.out.println("Enter item: ");
                    input.nextLine();
                    String item = input.nextLine();
                    System.out.println("Enter cost: ");
                    BigDecimal cost = input.nextBigDecimal();
                    list.addItem(item, cost);
                } else if (prompt.equals(SECOND)) {
                    System.out.println("Enter item to delete: ");
                    String item = input.nextLine();
                    list.removeItem(item);
                } else if (prompt.equals(THIRD)) {
                    list.showList();
                } else if (prompt.equals(FOURTH)) {
                    list.save();
                } else if (prompt.equals(FIFTH))
                    running = false;

                else
                    System.out.println("Invalid input, please try again");
            }
            catch(InputMismatchException e)
            {
                System.out.println("Incorrect input");
            }
        }
    }
}