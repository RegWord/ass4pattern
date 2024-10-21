package TemplateMethod;

// Класс для проверки качества электроники
public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Проверка работоспособности и гарантии.");
    }
}
