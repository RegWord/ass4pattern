package Observer;

// Класс подписчика, который получает только новости категории "Наука"
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String newsCategory, String newsContent) {
        if ("Наука".equals(newsCategory)) {
            System.out.println("Ноутбук получил новость: " + newsContent);
        }
    }
}
