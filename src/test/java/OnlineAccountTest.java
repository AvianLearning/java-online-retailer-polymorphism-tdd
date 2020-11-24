import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class OnlineAccountTest {

    OnlineAccount onlineAccount;
    IChargeable creditCard;

    @Before
    public void before() {
        onlineAccount = new OnlineAccount("Polly's Morphin'");
        IChargeable creditCard = new CreditCard(1234567812345678L, "05/25", 123, "Mastercard", 0.7, 1000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Polly's Morphin'", onlineAccount.getName());
    }

    @Test
    public void canAddPaymentMethod() {
        onlineAccount.addPaymentMethod(creditCard);
        assertEquals(1, onlineAccount.getPaymentMethods().size());
    }

    @Test
    public void canAddTransactionFee() {
        onlineAccount.addTransactionFee(10.00);
        assertEquals(1,onlineAccount.getTransactionFees().size());
        assertEquals(10.00, onlineAccount.getTransactionFees().get(0), 0.01);
    }

//    @Test
//    public void chargingCustomerLogsTransactionFeeInList() {
//        onlineAccount.addPaymentMethod(creditCard);
//        onlineAccount.chargeCustomer(0, 100.00);
//        assertEquals(1, onlineAccount.getTransactionFees().size());
//        assertEquals(1.40, onlineAccount.getTransactionFees().get(0), 0.01);
//    }
//    Should be able to chargeCustomer(int paymentMethodIndex, double transactionCost) via a selected paymentMethod:
//    charging that payment method (.charge(cost)) and logging the transaction fee in the OnlineAccount's transactionFees collection.
}
