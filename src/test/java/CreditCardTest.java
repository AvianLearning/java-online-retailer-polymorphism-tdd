import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(1234567812345678L, "05/25", 123, "Mastercard", 0.7, 1000.00);
    }

    @Test
    public void canGetCreditCardNumber() {
        assertEquals(1234567812345678L, creditCard.getCardNumber());
    }

    @Test
    public void canGetProvider() {
        assertEquals("Mastercard", creditCard.getProvider());
    }

    @Test
    public void chargingCardAddsToChargesList() {
        creditCard.charge(100.00);
        assertEquals(1, creditCard.getCharges().size());
    }

    @Test
    public void chargingCardReducesCreditLimitByPurchaseAmount() {
        creditCard.charge(100.00);
        assertEquals(900, creditCard.getCreditLimit(), 0.01);
    }

    @Test
    public void canGetCorrectTransactionFee() {
        assertEquals(1.40, creditCard.getTransactionFee(100.00), 0.01);
    }

}
