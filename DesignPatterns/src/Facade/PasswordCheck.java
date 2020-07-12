package Facade;

public class PasswordCheck {



        private String password = "Pizza";

        public String getPassword() { return password; }

        public boolean isPasswordCorrect(String passwordCheck){

            if(passwordCheck == getPassword()) {

                return true;

            } else {

                return false;

            }

        }

    }

