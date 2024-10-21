package Observer;

// Интерфейс для всех подписчиков, чтобы они могли получать обновления
public interface Observer {
    void update(String newsCategory, String newsContent);
}
