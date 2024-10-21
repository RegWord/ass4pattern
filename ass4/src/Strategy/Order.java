package Strategy;

// Класс заказа, который использует стратегию оплаты для расчёта итоговой стоимости
public class Order {
    private PaymentStrategy paymentStrategy;

    public Order(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy; // Устанавливаем стратегию оплаты
    }

    // Метод для расчёта итоговой стоимости заказа
    public double calculateFinalTotal(double orderAmount) {
        return paymentStrategy.calculateTotal(orderAmount);
    }
}

