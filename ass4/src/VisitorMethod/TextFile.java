package VisitorMethod;

// Класс текстового файла, который принимает посетителей
public class TextFile implements File {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Передаём себя посетителю
    }
}