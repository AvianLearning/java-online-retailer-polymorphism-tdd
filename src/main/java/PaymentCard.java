import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {
    private long cardNumber;
    private String expiryDate;
    private int securityNumber;
    private String provider;
    private ArrayList<Double> charges;

    public PaymentCard(long cardNumber, String expiryDate, int securityNumber, String provider) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.provider = provider;
        this.charges = new ArrayList<>();
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public String getProvider() {
        return provider;
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public void charge(double purchaseAmount) {
        getCharges().add(purchaseAmount);
    }
}
