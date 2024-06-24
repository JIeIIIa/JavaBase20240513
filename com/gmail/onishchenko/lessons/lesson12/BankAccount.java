package com.gmail.onishchenko.lessons.lesson12;

public class BankAccount {
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int delta) {
        if (money + delta < 0) {
            return;
        }

        money += delta;
    }

}

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
//        account.money += 123;
        account.setMoney(123);
        int myMoney = account.getMoney();
//        account.money -= 1_000_000;
        account.setMoney(-1_000_000);
        System.out.println("Operation success: " + (myMoney != account.getMoney()));

        System.out.printf("You have %d UAH", account.getMoney());
    }
}
