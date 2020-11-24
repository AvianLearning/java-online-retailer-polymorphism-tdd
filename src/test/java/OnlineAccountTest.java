import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {

    OnlineAccount onlineAccount;

    @Before
    public void before() {
        onlineAccount = new OnlineAccount("Polly's Morphin'");
    }

    @Test
    public void canGetName() {
        assertEquals("Polly's Morphin'", onlineAccount.getName());
    }
}
