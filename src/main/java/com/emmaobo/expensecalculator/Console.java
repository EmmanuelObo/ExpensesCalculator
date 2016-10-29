package com.emmaobo.expensecalculator;


import java.io.IOException;
import java.util.Scanner;

public class Console {

    private static final boolean INFINITE = true;

    public static void menu()
    {
        System.out.println("Welcome to The Expense Calculator.");
        System.out.println();
        System.out.println("Select one of the options from the list below");
        System.out.println("(1) Create a new list");
        System.out.println("(2) Load existing list");
        System.out.println("(3) Exit" );
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Controller controller ;
        String option;

        while(INFINITE)
        {
            menu();
            option = in.next();
            if(option.equals("1"))
            {
                PersonalList list = ListGenerator.generateList();
                controller = new Controller(list);
                controller.control();
            }
            else if(option.equals("2"))
            {

            }

            else if(option.equals("3"))
                break;
        }
        in.close();
    }
}
