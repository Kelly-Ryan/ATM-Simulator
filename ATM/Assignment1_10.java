package ATM;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Assignment1_10 {

    static Console cons = System.console();
    static Account[] accounts = new Account[3];
    static int accountIndex;

    public static void main(String[] args) {

        accounts[0] = new Account("45646432", "Julian", "King", "3435", 100);
        accounts[1] = new Account("48593741", "Anne", "Williams", "8246", 200);
        accounts[2] = new Account("15432432", "Derek", "James", "6157", 300);

        enterPIN();
    }

    static void enterPIN(){

        boolean validPIN = false;

        System.out.println("***********************************************");
        System.out.println("**********Welcome to the Bank of Duke**********");

        while(!validPIN){

            cons.printf("Enter your PIN number:");
            String inputPIN = new String (cons.readPassword());

            for(int i = 0; i < 3; i++){

                if(accounts[i].getPIN().equals(inputPIN)) {

                    cons.printf("PIN validated.");

                    validPIN = true;    //breaks while loop

                    accountIndex = i;   //so this account object can be referred to later on outside of this method

                    withdrawal();

                    break;      //break for loop once match found

                }
            }

            if(!validPIN){

                cons.printf("Invalid PIN number entered.");
            }
        }
    }


    static void withdrawal(){

        boolean validWithdrawal = false;
        int withdrawalSum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("The maximum withdrawal amount is 200 Euro.");
        System.out.println("Enter an amount: 20 | 40 | 60 | 80 | 100 | 200");

        ArrayList<Integer> validWithdrawalSums = new ArrayList<Integer>();      //ArrayList of valid denominations in which withdrawals can be made
        validWithdrawalSums.add(20);
        validWithdrawalSums.add(40);
        validWithdrawalSums.add(60);
        validWithdrawalSums.add(80);
        validWithdrawalSums.add(100);
        validWithdrawalSums.add(200);

        while(!validWithdrawal){

            System.out.println("Enter an amount to withdraw: ");

            try{

                withdrawalSum = scan.nextInt();

                //checks whether withdrawal amount is a positive number
                if(withdrawalSum >= 0){

                    //checks whether withdrawal amount is of a valid denomination
                    if(validWithdrawalSums.contains(withdrawalSum)){

                        validWithdrawal = true;

                    } else {

                        System.out.println("Invalid amount entered.");
                        System.out.println("Please enter amount in one of the following denominations: 20 | 40 | 60 | 80 | 100 | 200");
                    }
                } else {

                    System.out.println("Invalid amount entered. Withdrawal amount cannot be less than zero.");
                    System.out.println("Please enter one of the following amounts: 20 | 40 | 60 | 80 | 100 | 200");
                }

             //if withdrawal amount entered is anything other than an integer an exception will be thrown
            } catch (InputMismatchException e) {

                System.out.println("Data entry must be numeric and must not contain a decimal point.");
                scan.nextLine();
            }
        }

        if(validWithdrawal) {

            //checks whether there are sufficient funds in the account to facilitate the withdrawal
            if (withdrawalSum <= accounts[accountIndex].getBalance()) {

                System.out.println("Cash dispensed: " + withdrawalSum);
                accounts[accountIndex].withdrawFunds(withdrawalSum);    //balance updated
                System.out.println("Your new balance is " + accounts[accountIndex].getBalance());
                System.out.println("Have a nice day.");
                enterPIN();

            } else {

                System.out.println("Insufficient funds.");
                System.out.println("Existing balance: " + accounts[accountIndex].getBalance());
                System.out.println("Have a nice day.");
                enterPIN();
            }
        }
    }
}
