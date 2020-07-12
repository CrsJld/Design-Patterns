package Facade;

public class AccountCheck {

        private String accountId = "WarmCoffe";

        public String getAccountId() { return accountId; }

        public boolean accountActive(String acctIdToCheck){

            if(acctIdToCheck == getAccountId()) {

                return true;

            } else {

                return false;

            }

        }

    }

