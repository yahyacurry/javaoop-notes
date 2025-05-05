package PaymentSimulator;

import java.util.*;

import static PaymentSimulator.Transaction.exportTransactionsToCSV;

public class PaymentSystemSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentMethod paymentMethod = null;
        Refundable refundable = null;
        double lastPayment = 0.0;
        String lastMethod = "";

         List<Transaction> transactionHistory = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Payment System ===");
            System.out.println("1. Pay with Credit Card");
            System.out.println("2. Pay with PayPal");
            System.out.println("3. Pay with Bank Transfer");
            System.out.println("4. Request Refund");
            System.out.println("5. View Transactions");
            System.out.println("6. Export Transition History");
            System.out.println("7. Exit");
            System.out.print("> ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    paymentMethod = new CreditCardPayment();
                    refundable = (Refundable) paymentMethod;
                    lastMethod = "Credit Card";
                }
                case 2 -> {
                    paymentMethod = new PayPalPayment();
                    refundable = (Refundable) paymentMethod;
                    lastMethod = "PayPal";
                }
                case 3 -> {
                    paymentMethod = new BankTransferPayment();
                    refundable = (Refundable) paymentMethod;
                    lastMethod = "Bank Transfer";
                }
                case 4 -> {
                    if (refundable == null || lastPayment <= 0.0) {
                        System.out.println("❌ No previous payment to refund.");
                    } else {
//                        System.out.print("Enter refund reason: ");
//                        String reason = scanner.nextLine();
//                        refundable.processRefund(lastPayment, reason);
//                        lastPayment = 0.0;

                        System.out.print("Enter refund reason: ");
                        String reason = scanner.nextLine();
                        refundable.processRefund(lastPayment, reason);
                        String receipt = ((ReceiptProvider) refundable).getReceiptNumber();
                        transactionHistory.add(new Transaction("Refund", lastMethod, lastPayment, receipt, reason));

                    }
                    continue;
                }
                case 5 -> {
                    if (transactionHistory.isEmpty()) {
                        System.out.println("No transactions yet.");
                    } else {
                        System.out.println("\n=== Transaction History ===");
                        Collections.sort(transactionHistory);
                        for (Transaction t : transactionHistory) {
                            t.display();
                        }
                    }
                    continue;
                }


                case 6 -> {
                    exportTransactionsToCSV(transactionHistory);
                    continue;
                }

                case 7 -> {
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
            scanner.nextLine(); // consume newline
            paymentMethod.processPayment(amount);
            paymentMethod.generateReceipt();
            lastPayment = amount;

            String receipt = ((ReceiptProvider) paymentMethod).getReceiptNumber();
            transactionHistory.add(new Transaction("Payment", lastMethod, amount, receipt, ""));

        }
    }

}
