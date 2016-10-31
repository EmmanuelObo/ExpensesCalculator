package com.emmaobo.expensecalculator.main;

import com.emmaobo.expensecalculator.factories.ListGenerator;
import com.emmaobo.expensecalculator.pojo.Controller;
import com.emmaobo.expensecalculator.pojo.Menu;
import com.emmaobo.expensecalculator.pojo.PersonalList;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Console {

    private static final boolean INFINITE = true;
    private static final String CREATE_NEW_LIST = "1";
    private static final String RESTORE_EXISTING_LIST = "2";
    private static final String EXIT = "3";

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Controller controller ;
        String option;
        PersonalList list;

        while(INFINITE)
        {
            Menu.genMainMenu();
            option = in.next();
            if (option.equals(CREATE_NEW_LIST)) {
                Menu.genBudgetPrompt();
                option = in.next();
                if(option.equalsIgnoreCase("Y"))
                {
                    Menu.genInitBudget();
                    BigDecimal newBudget = in.nextBigDecimal();
                    list = ListGenerator.generateList(true, newBudget);
                    controller = new Controller(list);
                    controller.control();
                }
                if(option.equalsIgnoreCase("N"))
                {
                    list = ListGenerator.generateList(false);
                    controller = new Controller(list);
                    controller.control();
                }
            }
            else if (option.equals(RESTORE_EXISTING_LIST))
            {
                //TODO: Implement restore list functionality
            }
            else if (option.equals(EXIT))
                break;
        }
           in.close();
    }
}