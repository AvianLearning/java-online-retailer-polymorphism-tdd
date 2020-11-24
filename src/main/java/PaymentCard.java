import java.util.ArrayList;

public abstract class PaymentCard {
    private int cardNumber;
    private String expiryDate;
    private int securityNumber;
    private String provider;
    private ArrayList<Double> charges;

    public PaymentCard(int cardNumber, String expiryDate, int securityNumber, String provider) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.provider = provider;
        this.charges = new ArrayList<>();
    }
    
}
