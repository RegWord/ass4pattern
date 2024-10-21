package Observer;

import java.util.ArrayList;
import java.util.List;

// Конкретная реализация издателя новостей, управляющая подписчиками
public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> observers = new ArrayList<>(); // Список всех подписчиков

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer); // Добавляем нового подписчика в список
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer); // Удаляем подписчика из списка
    }

    @Override
    public void notifyObservers(String newsCategory, String newsContent) {
        // Уведомляем всех подписчиков о новой новости
        for (Observer observer : observers) {
            observer.update(newsCategory, newsContent);
        }
    }

    // Метод для публикации новостей
    public void publishNews(String newsCategory, String newsContent) {
        notifyObservers(newsCategory, newsContent);
    }
}
