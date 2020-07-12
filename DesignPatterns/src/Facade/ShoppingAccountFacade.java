package Facade;

public class ShoppingAccountFacade {

        private String accountId;
        private String password;

        AccountCheck acctChecker;
        PasswordCheck passChecker;
        FundsCheck fundChecker;

        Welcome ShopWelcome;


        public ShoppingAccountFacade(String newAcctId, String newPassword){

            accountId = newAcctId;
            password = newPassword;

            ShopWelcome = new Welcome();

            acctChecker = new AccountCheck();
            passChecker = new PasswordCheck();
            fundChecker = new FundsCheck();



        }

        public String getAccountId() { return accountId; }

        public String getPassword() { return password; }


        public void payCash(double cashToPay){

            if(acctChecker.accountActive(getAccountId()) &&
                    passChecker.isPasswordCorrect(getPassword()) &&
                    fundChecker.haveEnoughMoney(cashToPay)) {

                System.out.println("Transaction Complete\n");

            } else {

                System.out.println("Transaction Failed\n");

            }

        }



}
