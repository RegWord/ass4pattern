package Observer;

// Главный класс для тестирования реализации
public class Main {
    public static void main(String[] args) {
        NewsPublisherImpl publisher = new NewsPublisherImpl(); // Создаем издателя новостей

        // Создаем подписчиков
        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        // Добавляем подписчиков к издателю
        publisher.subscribe(smartphoneSubscriber);
        publisher.subscribe(laptopSubscriber);
        publisher.subscribe(tabletSubscriber);

        // Публикуем новости и проверяем, кто что получит
        publisher.publishNews("Спорт", "Новая спортивная новость!");
        publisher.publishNews("Наука", "Новое научное открытие!");
    }
}

