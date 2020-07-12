package Facade;

public class TestShoppingAccount {

        public static void main(String[] args){

            ShoppingAccountFacade accessingShop = new ShoppingAccountFacade("WarmCoffe", "Pizza");

            accessingShop.payCash(50);

            accessingShop.payCash(990.00);

        }

    }

