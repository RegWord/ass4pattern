package TemplateMethod;

// Главный класс для тестирования шаблонного метода
public class Main {
    public static void main(String[] args) {
        QualityCheck foodCheck = new FoodQualityCheck(); // Проверка продуктов питания
        foodCheck.checkProduct(); // Выполняем проверку

        QualityCheck electronicsCheck = new ElectronicsQualityCheck(); // Проверка электроники
        electronicsCheck.checkProduct();
    }
}

