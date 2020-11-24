import java.util.ArrayList;

public class OnlineAccount {
    private String name;
    private ArrayList<IChargeable> paymentMethods;
    private ArrayList<Double> transactionFees;

    public OnlineAccount(String name) {
        this.name = name;
        this.paymentMethods = new ArrayList<>();
        this.transactionFees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<IChargeable> getPaymentMethods() {
        return paymentMethods;
    }

    public ArrayList<Double> getTransactionFees() {
        return transactionFees;
    }

    public void addPaymentMethod(IChargeable card) {
        this.paymentMethods.add(card);
    }

    public void addTransactionFee(Double fee) {
        this.transactionFees.add(fee);
    }

    public void chargeCustomer(int paymentMethodIndex, double transactionCost) {
        IChargeable cardToCharge = this.paymentMethods.get(paymentMethodIndex);
        cardToCharge.charge(transactionCost);
        Double transactionFee = cardToCharge.getTransactionFee(transactionCost);
//    Should be able to chargeCustomer(int paymentMethodIndex, double transactionCost) via a selected paymentMethod:
//    charging that payment method (.charge(cost)) and logging the transaction fee in the OnlineAccount's transactionFees collection.
    }
}
