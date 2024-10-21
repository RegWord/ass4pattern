package Strategy;

// Стратегия оплаты электронным кошельком, без комиссии
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double orderAmount) {
        return orderAmount; // Без комиссии
    }
}
