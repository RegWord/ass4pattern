package VisitorMethod;

// Класс посетителя, который генерирует отчёт о проверке файлов
public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Отчёт: проверка текстового файла завершена.");
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Отчёт: проверка исполняемого файла завершена.");
    }
}