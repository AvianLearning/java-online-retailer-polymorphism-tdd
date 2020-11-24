import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard(1234567898765432L, "02/24", 321, "Barclays", 12_13_14, 12344321);
    }

    @Test
    public void canGetExpiryDate() {
        assertEquals("02/24", debitCard.getExpiryDate());
    }

    @Test
    public void canGetSecurityNumber() {
        assertEquals(321, debitCard.getSecurityNumber());
    }

    @Test
    public void canGetSortCode() {
        assertEquals(121314, debitCard.getSortCode());
    }

    @Test
    public void canGetAccountNumber() {
        assertEquals(12344321, debitCard.getAccountNumber());
    }


}

