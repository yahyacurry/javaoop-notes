package PaymentSimulator;


import java.util.Scanner;

public class BankTransferPayment implements PaymentMethod, Refundable {
    Scanner scanner = new Scanner(System.in);


    @Override
    public void processPayment(double amount) {
        System.out.println("Initiating Bank Transfer");
        System.out.println("Payment of: " + amount + " successful!");
    }

    @Override
    public void generateReceipt() {

        System.out.println(" Receipt: Payment made via Bank Transfer");

    }

    @Override
    public void Refund(double amount) {
        System.out.println("Enter the amount you want to refund");
        amount = scanner.nextDouble();
        System.out.println("Success Fully refunded BankTransfer payment of: " + amount);
    }
}
