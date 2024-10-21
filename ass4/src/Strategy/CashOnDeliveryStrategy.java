package Strategy;

// Стратегия оплаты наложенным платежом, добавляет стоимость доставки 300 рублей
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double orderAmount) {
        return orderAmount + 300; // Стоимость доставки 300 рублей
    }
}
