package Banking;
//Requirements for the Bank Account System
//Objective:
//
//Design a Bank Account system that allows users to perform basic transactions
// such as depositing, withdrawing, and checking their balance.
//
//Functional Requirements:
//
//    Create a bank account with an initial balance.
//        Users should specify an opening balance when creating an account.
//
//    Deposit money into the account.
//        Users should be able to increase their balance by depositing a positive amount.
//
//    Withdraw money from the account.
//        Users should be able to withdraw money if the account has sufficient funds.
//        If the withdrawal amount exceeds the balance, an insufficient funds warning should be displayed.
//
//    Display the current account balance.
//        The system should show the updated balance after each transaction.


import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);

  public int balance = 100;

    public  Bank(){

    }

      public int transactions(){
          System.out.println("Welcome to Bank Ahmed, In order to" +
                  " create your account. Please choose your starting balance");
          int balance2 = scanner.nextInt();
          balance = balance2;
          System.out.println("Current Balance: " + balance);
          System.out.println("Deposit Money -- 1");
          System.out.println("Withdraw Money -- 2");
          int option = scanner.nextInt();
          if(option == 1){
              System.out.println("How much money would you like to deposit?");
              int depositedMoney = scanner.nextInt();
              balance += depositedMoney;
              System.out.println("Current Balance: " + balance);
              System.out.println("Thank you for visiting Bank Ahmed");
          }
          if (option == 2){
              System.out.println("How much money would you like to withdraw?");
              int withdrawedMoney = scanner.nextInt();
              if(withdrawedMoney > balance){
                  System.out.println("ERROR NOT ENOUGH MONEY!!");
                  System.out.println("Current Balance: " + balance);
              } else  {

                  balance -= withdrawedMoney;
                  System.out.println("Current Balance: " + balance);
                  System.out.println("Thank you for visiting Bank Ahmed");
              }

          }


          return 0;
      }


    public static void main(String[] args) {
        Bank transactions = new Bank();
        System.out.println(transactions.transactions());
    }
}