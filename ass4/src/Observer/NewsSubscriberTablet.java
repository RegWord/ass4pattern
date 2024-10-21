package Observer;

// Класс подписчика, который получает все новости, независимо от категории
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String newsCategory, String newsContent) {
        System.out.println("Планшет получил новость: " + newsContent);
    }
}