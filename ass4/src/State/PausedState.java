package State;

// Класс состояния "Пауза"
public class PausedState implements PlayerState {
    @Override
    public void play() {
        System.out.println("Возобновление воспроизведения."); // Переход в состояние воспроизведения
    }

    @Override
    public void pause() {
        System.out.println("Плеер уже на паузе."); // Уже на паузе
    }

    @Override
    public void stop() {
        System.out.println("Остановка воспроизведения."); // Переход в состояние остановки
    }
}