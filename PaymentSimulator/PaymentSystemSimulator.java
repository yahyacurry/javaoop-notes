package PaymentSimulator;

import PaymentSimulator.CreditCardPayment;

import java.util.Locale;
import java.util.Scanner;

public class PaymentSystemSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentMethod paymentMethod = null;
        Refundable refundable = null;
        double lastPayment = 0.0;

        while (true) {
            System.out.println("\n=== Payment System ===");
            System.out.println("1. Pay with Credit Card");
            System.out.println("2. Pay with PayPal");
            System.out.println("3. Pay with Bank Transfer");
            System.out.println("4. Request Refund");
            System.out.println("5. Exit");
            System.out.print("> ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    paymentMethod = new CreditCardPayment();
                    refundable = (Refundable) paymentMethod;
                }
                case 2 -> {
                    paymentMethod = new PayPalPayment();
                    refundable = (Refundable) paymentMethod;
                }
                case 3 -> {
                    paymentMethod = new BankTransferPayment();
                    refundable = (Refundable) paymentMethod;
                }
                case 4 -> {
                    if (refundable == null || lastPayment <= 0.0) {
                        System.out.println("❌ No previous payment to refund.");
                    } else {
                        System.out.println("Would you like to make a refund of the last payment?");
                        String response = scanner.nextLine().toLowerCase(Locale.ROOT);
                        if (response.equals("yes")) {
                            refundable.processRefund(lastPayment);
                            lastPayment = 0.0;
                        }
                        else {
                            System.out.println("1. Paypal Refund");
                            System.out.println("2. CreditCard  Refund");
                            System.out.println("3. Bank Transfer Refund");
                            int option = scanner.nextInt();
                            if (option == 1){
                                paymentMethod = new PayPalPayment();
                                refundable = (Refundable) paymentMethod;
                            }
                            if (option == 2){
                                paymentMethod = new CreditCardPayment();
                                refundable = (Refundable) paymentMethod;
                            }
                            if (option == 3){
                                paymentMethod = new BankTransferPayment();
                                refundable = (Refundable) paymentMethod;
                            }
                        }
                    }
                    continue;
                }
                case 5 -> {
                    System.out.println("Thank you. Goodbye!");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice.");
                    continue;
                }
            }

            System.out.print("Enter amount to pay: ");
            double amount = scanner.nextDouble();
            paymentMethod.processPayment(amount);
            paymentMethod.generateReceipt();
            lastPayment = amount;
        }
    }
}
