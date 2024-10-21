package VisitorMethod;

// Интерфейс файла, который будет принимать посетителей
public interface File {
    void accept(Visitor visitor);
}