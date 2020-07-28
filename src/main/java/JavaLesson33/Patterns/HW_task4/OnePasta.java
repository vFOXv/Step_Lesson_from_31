package JavaLesson33.Patterns.HW_task4;

public class OnePasta implements Pasta{
    public OnePasta(){
        System.out.println("First type pasta create:");
        typePasta();
        saucePaste();
        fillingPaste();
        additivePaste();
    }

    @Override
    public void typePasta() {
        System.out.println("Type pasta "+"\t\t"+MyEnum.type.АНЬОЛОТТИ);
    }

    @Override
    public void saucePaste() {
        System.out.println("Sauce paste "+"\t"+MyEnum.sauce.БОЛОНЬЕЗЕ);
    }

    @Override
    public void fillingPaste() {
        System.out.println("Filling pasta "+"\t"+MyEnum.filling.СВИННАЯ);
    }

    @Override
    public void additivePaste() {
        System.out.println("Additive paste "+"\t" + MyEnum.additive.СЫР);
        System.out.println("\n");
    }
}
