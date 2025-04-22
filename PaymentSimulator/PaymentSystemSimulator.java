package PaymentSimulator;


    import java.util.Scanner;

    public class PaymentSystemSimulator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PaymentMethod paymentMethod;

            while (true) {
                System.out.println("\n=== Payment System ===");
                System.out.println("Choose payment method:");
                System.out.println("1. Credit Card");
                System.out.println("2. PayPal");
                System.out.println("3. Bank Transfer");
                System.out.println("4. Request Refund");
                System.out.println("5. Exit");
                System.out.print("> ");
                int choice = scanner.nextInt();


                if (choice == 5) {
                    System.out.println("Thank you. Goodbye!");
                    break;
                }

                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();

                switch (choice) {
                    case 1 -> paymentMethod = new CreditCardPayment();
                    case 2 -> paymentMethod = new PayPalPayment();
                    case 3 -> paymentMethod = new BankTransferPayment();
                    default -> {
                        System.out.println("Invalid choice.");
                        continue;
                    }
                }

                paymentMethod.processPayment(amount);
                paymentMethod.generateReceipt();
                
     }
    }}

