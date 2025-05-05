package PaymentSimulator2;

import java.util.Scanner;
import java.util.UUID;

public class Paypal2 implements PaymentMethod2, Refundable2{
    Scanner scanner = new Scanner(System.in);
    String receiptNumber;
    @Override
    public void proccessPayment(double amount) {
        receiptNumber = UUID.randomUUID().toString().substring(0,8);
        System.out.println("Payment of Paypal made SuccessFully!");
        System.out.println("Payment of: " + amount );
    }

    @Override
    public void generateReceipt() {
        System.out.println("Linked Reciept Number: " + receiptNumber);
    }

    @Override
    public void proccesRefund(double amount, String reason) {

        System.out.println("Refund Reason: " + reason);
        System.out.println("Refunded amount: " + amount);
        System.out.println("Linked Receipt Number to Reason: " + receiptNumber);
    }
}
