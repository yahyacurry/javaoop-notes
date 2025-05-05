package PaymentSimulator;

import java.util.UUID;

class PayPalPayment implements PaymentMethod, Refundable, ReceiptProvider {
    private String receiptNumber;

    @Override
    public void processPayment(double amount) {
        receiptNumber = "PP"+UUID.randomUUID().toString().substring(0, 8);
        System.out.println("Processing credit card payment...");
        System.out.println("Payment of $" + amount + " successful!");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt #" + receiptNumber + ": Payment made with Credit Card");
    }

    @Override
    public void processRefund(double amount, String reason) {
        System.out.println("Processing credit card refund...");
        System.out.println("Refund of $" + amount + " successful!");
        System.out.println("Reason: " + reason);
        System.out.println("Linked to Receipt #" + receiptNumber);
}

    public String getReceiptNumber() {
        return receiptNumber;
    }
}