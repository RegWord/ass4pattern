package Observer;

// Интерфейс для издателя новостей, который управляет подписчиками
public interface NewsPublisher {
    void subscribe(Observer observer); // Добавить подписчика
    void unsubscribe(Observer observer); // Удалить подписчика
    void notifyObservers(String newsCategory, String newsContent); // Уведомить всех подписчиков
}

