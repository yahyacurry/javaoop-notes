package PaymentSimulator;

import PaymentSimulator.PaymentMethod;
import PaymentSimulator.Refundable;

public class CreditCardPayment implements PaymentMethod, Refundable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment...");
        System.out.println("Payment of $" + amount + " successful!");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt: Payment made with Credit Card");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Processing refund to credit card...");
        System.out.println("Refund of $" + amount + " successful!");
}
}