package Facade;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() { return cashInAccount; }

    public void decreaseCashInAccount(double cashSpent) { cashInAccount -= cashSpent; }


    public boolean haveEnoughMoney(double Price) {

        if(Price > getCashInAccount()) {

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());

            return false;

        } else {

            decreaseCashInAccount(Price);

            System.out.println("Transaction Complete: Current Balance is " + getCashInAccount());

            return true;

        }

    }

}