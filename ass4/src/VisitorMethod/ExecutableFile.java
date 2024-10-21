package VisitorMethod;

// Класс исполняемого файла, который принимает посетителей
public class ExecutableFile implements File {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Передаём себя посетителю
    }
}