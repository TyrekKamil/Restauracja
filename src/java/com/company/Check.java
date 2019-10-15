package com.company;

import java.util.ArrayList;

public class Check {
    int tableNumber;
    boolean paid = false;
    ArrayList<MenuItem> check = new ArrayList();
    float cost;

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setPaid() {
        this.paid = true;
    }

    public boolean isPaid() {
        return paid;
    }

    public ArrayList<MenuItem> getOrder() {
        return check;
    }

    public void addToCheck(MenuItem item) {
        this.check.add(item);
    }

    public void setCost(ArrayList<MenuItem> order) {
        float total = 0;
        for (MenuItem item: order) {
            total += item.getPrice();
        }
        this.cost = total;
    }

    public float getCost() {
        return cost;
    }
}
