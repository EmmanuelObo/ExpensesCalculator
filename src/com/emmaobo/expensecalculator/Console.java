package com.emmaobo.expensecalculator;


import java.util.Scanner;

public class Console {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PersonalList list = new PersonalList();
        System.out.println("Enter an item:");
        String item1 = in.next();
        list.addItem(item1, 9.99);
        String item2 = in.next();
        list.addItem(item2, 5.99);
        list.showList();
        list.getTotal();
        list.removeItem("Bag");
        list.showList();
        list.getTotal();
    }
}
