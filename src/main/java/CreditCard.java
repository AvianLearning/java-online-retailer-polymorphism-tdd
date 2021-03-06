public class CreditCard extends PaymentCard {

    private double riskMultiplier;
    private double creditLimit;

    public CreditCard(long cardNumber, String expiryDate, int securityNumber, String provider, double riskMultiplier, double creditLimit) {
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
        double percentage = (2 * this.riskMultiplier) / 100;
        return percentage * purchaseAmount;
    }

    @Override
    public void charge(double purchaseAmount) {
        getCharges().add(purchaseAmount);
        this.creditLimit -= purchaseAmount;
    }
}
