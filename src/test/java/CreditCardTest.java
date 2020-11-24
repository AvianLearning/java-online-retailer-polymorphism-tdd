import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(12345678, "05/25", 123, "Mastercard", 0.5, 1000.00);
    }

    @Test
    public void canGetCreditCardNumber() {
        assertEquals(12345678, creditCard.getCardNumber());
    }


}
