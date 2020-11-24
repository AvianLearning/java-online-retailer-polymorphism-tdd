public interface IChargeable {
    double getTransactionFee(double purchaseAmount);
    void charge(double purchaseAmount);
}
