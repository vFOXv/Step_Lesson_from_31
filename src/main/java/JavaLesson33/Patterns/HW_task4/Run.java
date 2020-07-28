package JavaLesson33.Patterns.HW_task4;

public class Run {
    //Создайте приложение для приготовления пасты.
    //Приложение должно уметь создавать минимум три вида
    //пасты. Классы различной пасты должны иметь следующие методы:
    //■ Тип пасты;
    //■ Соус;
    //■ Начинка;
    //■ Добавки.
    //Для реализации используйте порождающие паттерны.

    //factory method
    public static void main(String[] args) {
        PastaFactory pastaFactory = new PastaFactory();

        Pasta one = pastaFactory.getPasta(MyEnum.numberDish.ONE);
        Pasta two = pastaFactory.getPasta(MyEnum.numberDish.TWO);
        Pasta three = pastaFactory.getPasta(MyEnum.numberDish.THREE);
        Pasta four = pastaFactory.getPasta(MyEnum.numberDish.FOUR);
    }
}
