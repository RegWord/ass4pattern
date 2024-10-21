package Observer;

// Класс подписчика, который получает только новости категории "Спорт"
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String newsCategory, String newsContent) {
        if ("Спорт".equals(newsCategory)) {
            System.out.println("Смартфон получил новость: " + newsContent);
        }
    }
}