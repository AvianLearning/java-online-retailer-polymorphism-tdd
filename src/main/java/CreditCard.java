public class CreditCard extends PaymentCard {

    private double riskMultiplier;
    private double creditLimit;

    public CreditCard(int cardNumber, String expiryDate, int securityNumber, String provider, double riskMultiplier, double creditLimit) {
        super(cardNumber, expiryDate, securityNumber, provider);
        this.riskMultiplier = riskMultiplier;
        this.creditLimit = creditLimit;
    }

    public double getRiskMultiplier() {
        return riskMultiplier;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public double getTransactionFee(double purchaseAmount) {
        return 0;
    }

    @Override
    public void charge(double purchaseAmount) {
        getCharges().add(purchaseAmount);
        this.creditLimit -= purchaseAmount;
    }
}
