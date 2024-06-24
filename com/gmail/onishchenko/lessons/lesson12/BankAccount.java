package com.gmail.onishchenko.lessons.lesson12;

public class BankAccount {
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean change(int delta) {
        if(money + delta >=0 ) {
            money += delta;
            return true;
        } else {
            return false;
        }
    }

}

class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
//        account.money += 123;
        account.change(123);
//        account.money -= 1_000_000;
        boolean result = account.change(-1_000_000);
        System.out.println("Operation success: " + result);

        System.out.printf("You have %d UAH", account.getMoney());
    }
}
