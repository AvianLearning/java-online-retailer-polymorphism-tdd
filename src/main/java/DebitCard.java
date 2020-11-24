public class DebitCard extends PaymentCard {

    private int sortCode;
    private int accountNumber;

    public DebitCard(long cardNumber, String expiryDate, int securityNumber, String provider, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, securityNumber, provider);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public int getSortCode() {
        return sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getTransactionFee(double purchaseAmount) {
        return purchaseAmount * 0.02;
    }

}
