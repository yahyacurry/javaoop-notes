package PaymentSimulator2;

import com.sun.jdi.connect.Connector;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PaymentSimulator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastAmount = 0;
        String lastMethod = "";
        PaymentMethod2 paymentMethod2 = null;
        Refundable2 refundable2 = null;
        while (true) {
            System.out.println("Select an option!");
            System.out.println("1. Pay with Credit Card");
            System.out.println("2. Pay with Paypal");
            System.out.println("3. Pay with BankTransfer");
            System.out.println("4. Request Refund");
            System.out.println("5. Exit");
            System.out.println(">");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 5){

                    System.out.println("Thank you! Bye!");
                    break;

            }
            switch (option) {
                case 1 -> {
                    paymentMethod2 = new CreditCard2();
                    refundable2 = new CreditCard2();
                    lastMethod = "Credit Card";
                }
                case 2 -> {
                    paymentMethod2 = new Paypal2();
                    refundable2 = new Paypal2();
                    lastMethod = "Paypal";

                }
                case 3 ->{
                    paymentMethod2 = new BankTransfer2();
                    refundable2 = new BankTransfer2();
                    lastMethod = "Bank Transfer";

                }
                case 4 -> {
                    if (refundable2 == null|| lastAmount ==0){
                        System.out.println("No Transactions to Refund");
                        continue;
                    }
                    else {
                        System.out.println("Enter Refund Reason: ");
                        String reason = scanner.nextLine();
                        refundable2.proccesRefund(lastAmount, reason);
                        lastAmount = 0;
                        continue;
                    }

                }

                default -> {
                    System.out.println("Invalid number");
                    System.out.println("Try again");
                    continue;
                }


            }
            System.out.println("Enter Amount to Pay: ");
            int amount = scanner.nextInt();
            lastAmount = amount;
            paymentMethod2.proccessPayment(amount);
            paymentMethod2.generateReceipt();

        }
    }

}
