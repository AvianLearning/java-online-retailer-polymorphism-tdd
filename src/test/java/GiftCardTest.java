import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before() {
        giftCard = new GiftCard(50.00, "John Lewis");
    }

    @Test
    public void canGetBalance() {
        assertEquals(50.00, giftCard.getBalance(), 0.01);
    }

    @Test
    public void canGetVendorName() {
        assertEquals("John Lewis", giftCard.getVendor());
    }

}

