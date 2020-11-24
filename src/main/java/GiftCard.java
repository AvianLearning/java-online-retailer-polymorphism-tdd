public class GiftCard implements IChargeable {

    private double balance;
    private String vendor;

    public GiftCard(double balance, String vendor) {
        this.balance = balance;
        this.vendor = vendor;
    }

    public double getBalance() {
        return balance;
    }

    public String getVendor() {
        return vendor;
    }

    @Override
    public double getTransactionFee(double purchaseAmount) {
        return 0;
    }

    @Override
    public void charge(double purchaseAmount) {
        this.balance -= purchaseAmount;
    }
}
