package PaymentSimulator;

import java.util.Scanner;

class PayPalPayment implements PaymentMethod, Refundable {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void processPayment(double amount) {
        System.out.println("Logging into PayPal...");
        System.out.println("Payment of $" + amount + " successful!");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt: Payment made with PayPal");
    }

    @Override
    public void Refund(double amount) {
        System.out.println("Enter the amount you want to refund");
        amount = scanner.nextDouble();
        System.out.println("Success Fully refunded paypal payment of: " + amount);
    }
}

