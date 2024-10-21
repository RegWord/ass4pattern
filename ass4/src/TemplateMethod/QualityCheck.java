package TemplateMethod;

// Абстрактный класс для проверки качества товаров
public abstract class QualityCheck {
    public void checkProduct() {
        checkAppearance(); // Проверяем внешний вид товара
        checkSpecifics(); // Проверяем специфические характеристики товара (метод должен быть реализован в наследниках)
        generateReport(); // Генерируем итоговый отчёт
    }

    // Метод для проверки внешнего вида товара
    private void checkAppearance() {
        System.out.println("Проверка внешнего вида.");
    }

    // Абстрактный метод, который будет реализован в подклассах
    protected abstract void checkSpecifics();

    // Метод для генерации отчёта
    private void generateReport() {
        System.out.println("Заключительный отчёт.");
    }
}

