package State;

// Главный класс для тестирования плеера
public class Main {
    public static void main(String[] args) {
        Player player = new Player(new StoppedState()); // Плеер в состоянии остановки

        player.play(); // Воспроизведение с начала
        player.setState(new PlayingState()); // Переключение на состояние воспроизведения
        player.pause(); // Ставим на паузу
        player.setState(new PausedState()); // Плеер на паузе
        player.play(); // Возобновляем воспроизведение
        player.stop(); // Останавливаем плеер
    }
}
