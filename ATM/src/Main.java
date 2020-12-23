import atmMachine.*;

public class Main
{
    public static void main(String[] args) {


        /**
         * For Calling the inner class(Auth) of userInterface class.
         * First you have to make a instance of outer class and by using that instance you can call the constructor
         * Inner class.
         */

        userInterface obj = new userInterface();
        userInterface.Auth auth = obj.new Auth();

        /**
         * The login Id and password are static right now
         * ID: 1234
         * Password: 1234
         */
        boolean cred = false;
        do{
            cred = auth.validation();
        }while(cred);

        obj.getInterface();
    }
}
