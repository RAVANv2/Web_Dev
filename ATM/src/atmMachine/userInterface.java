package atmMachine;

import java.util.HashMap;
import java.util.Scanner;

public class userInterface
{
    private int item;
    private int balance;

    private void getAccountBalance()
    {
        System.out.println("Your balance is : "+this.balance + "$");
    }
    private void putBalance(int amt)
    {
        this.balance += amt;
        System.out.println("Your New Balance is :"+ this.balance+"$");
    }
    private void deductAmount(int amt)
    {
        this.balance -= amt;
        System.out.println("Your New Balance is :"+ this.balance+"$");
    }

    public void getInterface()
    {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Which item you want to choose :\n 1. Account Balance\n 2. Deposit Amount\n 3. Withdraw Amount\n 4. Exit");
            item = sc.nextInt();
            switch (item) {
                case 1: {
                    this.getAccountBalance();
                    break;
                }

                case 2: {
                    System.out.print("Enter Amount: ");
                    int amt = sc.nextInt();
                    this.putBalance(amt);
                    break;
                }

                case 3: {
                    System.out.print("Enter Withdraw Amount: ");
                    int amt = sc.nextInt();
                    this.deductAmount(amt);
                    break;
                }
                case 4:
                {
                    break;
                }
                default: {
                    System.out.println("Invalid");
                    break;
                }
            }
        }while (item!=4);
        System.out.println("Have A Nice Day :) ");
    }

    public class Auth
    {
        private HashMap<Integer, Integer> map = new HashMap<>();
        public Auth()
        {
            map.put(1234, 1234);
        }

        public Boolean validation()
        {
            boolean result=true;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your ID: ");
            int id = sc.nextInt();
            System.out.print("Enter your password: ");
            int pass = sc.nextInt();

            if(map.containsKey(id) && map.containsValue(pass))
            {System.out.println(" \n \nHii their, Welcome to LALA Bank \n \n"); result=false;}
            else
                System.out.println("Please Enter correct information");

            return result;
        }
    }

}


