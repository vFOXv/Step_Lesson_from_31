package JavaLesson33.Patterns.HW_task4;

public class ThreePasta implements Pasta{

    public ThreePasta(){
        System.out.println("Third type pasta create:");
        typePasta();
        saucePaste();
        fillingPaste();
        additivePaste();
    }

    @Override
    public void typePasta() {
        System.out.println("Type pasta "+"\t\t"+MyEnum.type.ДИТАЛИНИ);
    }

    @Override
    public void saucePaste() {
        System.out.println("Sauce paste "+"\t"+MyEnum.sauce.ГРИБНОЙ);
    }

    @Override
    public void fillingPaste() {
        System.out.println("Filling pasta "+"\t"+MyEnum.filling.ТВОРОЖНАЯ);
    }

    @Override
    public void additivePaste() {
        System.out.println("Additive paste "+"\t" + MyEnum.additive.МАЙОНЕЗ);
        System.out.println("\n");
    }
}
