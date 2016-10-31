package com.emmaobo.expensecalculator.pojo;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller{

    private boolean running = true;
    private final String ADD_ITEM = "1";
    private final String DELETE_ITEM = "2";
    private final String SHOW_LIST = "3";
    private final String SAVE = "4";
    private final String EXIT = "5";
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
                if (prompt.equals(ADD_ITEM))
                {
                    System.out.println("Enter item: ");
                    input.nextLine();
                    String item = input.nextLine();
                    System.out.println("Enter cost: ");
                    BigDecimal cost = input.nextBigDecimal();
                    list.addItem(item, cost);
                }
                else if (prompt.equals(DELETE_ITEM))
                {
                    System.out.println("Enter item to delete: ");
                    String item = input.nextLine();
                    list.removeItem(item);
                }
                else if (prompt.equals(SHOW_LIST))
                {
                    list.showList();
                }
                else if (prompt.equals(SAVE))
                {
                    list.save();
                }
                else if (prompt.equals(EXIT))
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