package PaymentSimulator2;

import java.util.Calendar;
import java.util.List;

public class TransactionHistory {
    List<TransactionHistory> transactions;
    String method;
    String recieptNumber;
    String amount;


    public void display() {
        System.out.println( "TransactionHistory{" +
                "method='" + method + '\'' +
                ", recieptNumber='" + recieptNumber + '\'' +
                ", amount='" + amount + '\'' +
                '}');
    }


}
