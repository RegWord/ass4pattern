package State;

// Интерфейс для описания поведения плеера в разных состояниях
public interface PlayerState {
    void play(); // Воспроизведение
    void pause(); // Пауза
    void stop(); // Остановка
}
