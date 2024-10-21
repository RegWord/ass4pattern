package Strategy;

// Интерфейс для стратегий оплаты
public interface PaymentStrategy {
    double calculateTotal(double orderAmount); // Метод для расчёта стоимости заказа
}
