import java.util.ArrayList;

public class OnlineAccount {
    private String name;
    private ArrayList<PaymentCard> paymentMethods;
    private ArrayList<Double> transactionFees;

    public OnlineAccount(String name) {
        this.name = name;
        this.paymentMethods = new ArrayList<>();
        this.transactionFees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<PaymentCard> getPaymentMethods() {
        return paymentMethods;
    }

    public ArrayList<Double> getTransactionFees() {
        return transactionFees;
    }

}
