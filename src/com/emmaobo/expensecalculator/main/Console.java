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

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Controller controller ;
        String option;
        PersonalList list;

        while(INFINITE)
        {
            Menu.genMainMenu();
            option = in.next();
            if (option.equals("1")) {
                Menu.genBudgetPrompt();
                option = in.next();
                if(option.equalsIgnoreCase("Y")) {
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

            } else if (option.equals("2")) {
                //Code
            } else if (option.equals("3"))
                break;
        }
           in.close();
    }
}