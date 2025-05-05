package PaymentSimulator;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


class Transaction implements Comparable<Transaction> {    private final String type;
    private final String method;
    private final double amount;
    private final String receiptNumber;
    private final String note;
    private final LocalDateTime timestamp;

    public Transaction(String type, String method, double amount, String receiptNumber, String note) {
        this.type = type;
        this.method = method;
        this.amount = amount;
        this.receiptNumber = receiptNumber;
        this.note = note;
        this.timestamp = LocalDateTime.now();
    }

    public void display() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("[" + type + "] $" + amount + " via " + method);
        System.out.println("Receipt: " + receiptNumber);
        if (!note.isEmpty()) {
            System.out.println("Note: " + note);
        }
        System.out.println("Time: " + timestamp.format(formatter));
        System.out.println();
    }

    @Override
    public int compareTo(Transaction other) {
        return other.timestamp.compareTo(this.timestamp); // descending
    }


    public String toCSV() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.join(",", type, method, String.valueOf(amount), receiptNumber, note.replace(",", " "), timestamp.format(formatter));
    }
    static void exportTransactionsToCSV(List<Transaction> transactions) {
        if (transactions.isEmpty()) {
            System.out.println("No transactions to export.");
            return;
        }

        try (PrintWriter writer = new PrintWriter("transactions.csv")) {
            writer.println("Type,Method,Amount,Receipt,Note,Timestamp");
            for (Transaction t : transactions) {
                writer.println(t.toCSV());
            }
            System.out.println("✅ Transactions exported to transactions.csv");
        } catch (Exception e) {
            System.out.println("❌ Failed to export transactions: " + e.getMessage());
        }
    }

}









