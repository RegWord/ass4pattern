package Strategy;

// Главный класс для тестирования различных стратегий оплаты
public class Main {
    public static void main(String[] args) {
        Order order = new Order(new CardPaymentStrategy()); // Заказ с оплатой картой
        System.out.println("Оплата картой: " + order.calculateFinalTotal(1000)); // Печатаем итоговую стоимость

        order = new Order(new WalletPaymentStrategy()); // Заказ с оплатой электронным кошельком
        System.out.println("Оплата кошельком: " + order.calculateFinalTotal(1000));

        order = new Order(new CashOnDeliveryStrategy()); // Заказ с наложенным платежом
        System.out.println("Оплата наложенным платежом: " + order.calculateFinalTotal(1000));
    }
}
