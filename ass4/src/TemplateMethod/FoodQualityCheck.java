package TemplateMethod;

// Класс для проверки качества продуктов питания
public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Проверка срока годности и состава.");
    }
}