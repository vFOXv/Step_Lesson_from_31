package JavaLesson33.Patterns.HW_task4;

public class FourPasta implements Pasta{

    public FourPasta(){
        System.out.println("Fourth type pasta create:");
        typePasta();
        saucePaste();
        fillingPaste();
        additivePaste();
    }

    @Override
    public void typePasta() {
        System.out.println("Type pasta "+"\t\t"+MyEnum.type.ЗИТИ);
    }

    @Override
    public void saucePaste() {
        System.out.println("Sauce paste "+"\t"+MyEnum.sauce.ПЕСТО);
    }

    @Override
    public void fillingPaste() {
        System.out.println("Filling pasta "+"\t"+MyEnum.filling.ВИШНЕВАЯ);
    }

    @Override
    public void additivePaste() {
        System.out.println("Additive paste "+"\t" + MyEnum.additive.СЛИВКИ);
        System.out.println("\n");
    }
}
