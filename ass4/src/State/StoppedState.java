package State;

// Класс состояния "Остановка"
public class StoppedState implements PlayerState {
    @Override
    public void play() {
        System.out.println("Воспроизведение начато с начала."); // Воспроизведение с начала
    }

    @Override
    public void pause() {
        System.out.println("Невозможно поставить на паузу, плеер остановлен."); // Нельзя поставить на паузу
    }

    @Override
    public void stop() {
        System.out.println("Плеер уже остановлен."); // Уже остановлен
    }
}