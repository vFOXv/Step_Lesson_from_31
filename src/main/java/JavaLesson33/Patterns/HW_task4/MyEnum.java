package JavaLesson33.Patterns.HW_task4;

public class MyEnum {
    //тип пасты
    static enum type {
        АНЬОЛОТТИ,
        БУКАТИНИ,
        ДИТАЛИНИ,
        ЗИТИ
    }

    //соус
    static enum sauce {
        БОЛОНЬЕЗЕ,
        КАРБОНАРА,
        ГРИБНОЙ,
        ПЕСТО
    }

    //начинка
    static enum filling {
        СВИННАЯ,
        КУРИНАЯ,
        ТВОРОЖНАЯ,
        ВИШНЕВАЯ
    }

    //добавки
    static enum additive {
        СЫР,
        ТОМАТ,
        МАЙОНЕЗ,
        СЛИВКИ
    }

    //номер готовой пасты
    static enum numberDish{
        ONE,
        TWO,
        THREE,
        FOUR
    }
}
