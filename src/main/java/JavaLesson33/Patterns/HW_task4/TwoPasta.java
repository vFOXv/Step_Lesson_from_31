package JavaLesson33.Patterns.HW_task4;

public class TwoPasta implements Pasta{

    public TwoPasta(){
        System.out.println("Second type pasta create:");
        typePasta();
        saucePaste();
        fillingPaste();
        additivePaste();
    }

    @Override
    public void typePasta() {
        System.out.println("Type pasta "+"\t\t"+MyEnum.type.БУКАТИНИ);
    }

    @Override
    public void saucePaste() {
        System.out.println("Sauce paste "+"\t"+MyEnum.sauce.КАРБОНАРА);
    }

    @Override
    public void fillingPaste() {
        System.out.println("Filling pasta "+"\t"+MyEnum.filling.КУРИНАЯ);
    }

    @Override
    public void additivePaste() {
        System.out.println("Additive paste "+"\t" + MyEnum.additive.ТОМАТ);
        System.out.println("\n");
    }
}
