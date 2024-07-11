package com.gmail.onishchenko.lessons.lesson12;

public class BankAccount {
    private int money;
    private boolean active;

    public int getMoney() {
        return money;
    }

    void setMoney(int delta) {
        if (money + delta < 0) return;
        money += delta;
    }

    public boolean isActive() {
        return active;
    }

    public void testMethod(int a,
                           int b,
                           int c) {

    }
}