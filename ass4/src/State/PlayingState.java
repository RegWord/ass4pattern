package State;

// Класс состояния "Воспроизведение"
public class PlayingState implements PlayerState {
    @Override
    public void play() {
        System.out.println("Уже воспроизводится."); // Уже в состоянии воспроизведения
    }

    @Override
    public void pause() {
        System.out.println("Плеер на паузе."); // Переход в состояние паузы
    }

    @Override
    public void stop() {
        System.out.println("Воспроизведение остановлено."); // Переход в состояние остановки
    }
}
