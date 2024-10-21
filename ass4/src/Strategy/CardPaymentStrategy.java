package Strategy;

// Стратегия оплаты картой, добавляет комиссию 2%
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double orderAmount) {
        return orderAmount * 1.02; // Комиссия 2%
    }
}