package State;

// Класс плеера, который управляет состояниями
public class Player {
    private PlayerState state;

    public Player(PlayerState initialState) {
        this.state = initialState; // Начальное состояние
    }

    // Метод для смены состояния
    public void setState(PlayerState state) {
        this.state = state;
    }

    // Действие воспроизведения
    public void play() {
        state.play();
    }

    // Действие паузы
    public void pause() {
        state.pause();
    }

    // Действие остановки
    public void stop() {
        state.stop();
    }
}
