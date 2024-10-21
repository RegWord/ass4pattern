package VisitorMethod;

// Главный класс для тестирования паттерна "Посетитель"
public class Main {
    public static void main(String[] args) {
        // Создаём файлы
        File textFile = new TextFile();
        File exeFile = new ExecutableFile();

        // Создаём посетителей
        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        // Проверяем файлы с помощью посетителей
        textFile.accept(antivirus);
        exeFile.accept(antivirus);

        textFile.accept(report);
        exeFile.accept(report);
    }
}
