package VisitorMethod;

// Класс посетителя, который выполняет проверку на вирусы
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Проверка текстового файла на запрещённые слова.");
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Проверка исполняемого файла на вредоносный код.");
    }
}
