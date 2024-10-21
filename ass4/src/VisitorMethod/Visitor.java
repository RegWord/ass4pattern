package VisitorMethod;

// Интерфейс посетителя, который будет обрабатывать разные типы файлов
public interface Visitor {
    void visit(TextFile textFile); // Обработка текстовых файлов
    void visit(ExecutableFile executableFile); // Обработка исполняемых файлов
}