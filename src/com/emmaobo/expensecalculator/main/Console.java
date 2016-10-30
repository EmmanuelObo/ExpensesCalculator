package com.emmaobo.expensecalculator.main;

import com.emmaobo.expensecalculator.factories.ListGenerator;
import com.emmaobo.expensecalculator.pojo.Controller;
import com.emmaobo.expensecalculator.pojo.Menu;
import com.emmaobo.expensecalculator.pojo.PersonalList;

import java.io.IOException;
import java.util.Scanner;

public class Console {

    private static final boolean INFINITE = true;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Controller controller ;
        String option;

        while(INFINITE)
        {
            Menu.genMainMenu();
            option = in.next();
            if (option.equals("1")) {
                PersonalList list = ListGenerator.generateList();
                controller = new Controller(list);
                controller.control();
            } else if (option.equals("2")) {
                //Code
            } else if (option.equals("3"))
                break;
        }
           in.close();
    }
}