package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public static ArrayList<Order> orders = new ArrayList<>();

   /* public static ArrayList<Order> setCheck(int tableNum) {
        ArrayList<Order> total = new ArrayList<>();
        for(Order order : orders) {
            if (order.getTableNumber() == tableNum && order.isPaid() == false) {
                total.add(order);
            }
        }
        return total;
    } */

    public static void newOrder(int tableNum) {
        Order order = new Order();
        order.setTableNumber(tableNum);
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equals("")) {break;}
            try {
                int id = Integer.parseInt(line);
               // order.addToOrder(menu.get(id));
            } catch (Exception e) {
                System.out.println("Podaj nr pozycji w menu:");
            }
        }
        //send order to the kitchen
        orders.add(order);

    }

    public static void addToOrder(int tableNum) {
        Scanner input = new Scanner(System.in);
        for (Order order : orders) {
            if (order.getTableNumber() == tableNum && order.isPaid() == false) {
                while(input.hasNextLine()) {
                order.addToOrder(menu.get(Integer.parseInt(input.nextLine())));
                //send order to the kitchen
                }
                break;
            }
        }
    }

    public static ArrayList<Check> setChecks(Order order, int checksNum) {
        ArrayList<Check> checks = new ArrayList<>();
        if (checksNum > 1) {
            for(int i = 0; i < checksNum; i++) {
                Check check = new Check();
                checks.add(check);
            }
            Scanner input = new Scanner(System.in);
            for (MenuItem item: order.order) {
                System.out.println(item);
                checks.get(Integer.parseInt(input.nextLine())).addToCheck(item);
            }
        }
        else {
            Check check = new Check();
            for (MenuItem item: order.order) {
                check.addToCheck(item);
            }
            checks.add(check);
        }
        return checks;
    }

    public static void payment(int tableNum) {
        for (Order order : orders) {
            if (order.getTableNumber() == tableNum && order.isPaid() == false) {
                System.out.println("Ile rachunków?");
                Scanner input = new Scanner(System.in);
                setChecks(order, Integer.parseInt(input.nextLine()));
                break;
            }
        }

        //send order cost to cash register
        //order.setPaid();
    }

    public static void main(String[] args) {

        System.out.println("1. New order 2. Add to order 3. Payment");
        Scanner input = new Scanner(System.in);
        switch(input.nextLine()) {
            case "1":
                newOrder(Integer.parseInt(input.nextLine()));
                break;
            case "2":
                addToOrder(Integer.parseInt(input.nextLine()));
                break;
            case "3":
                payment(int tableNum);
                break;
        }
    }
}