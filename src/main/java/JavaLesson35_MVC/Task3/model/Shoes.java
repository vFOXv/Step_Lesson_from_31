package JavaLesson35_MVC.Task3.model;


public class Shoes {

    Kind kindShoes;
    Type typeShoes;
    Color colorShoes;
    Manufacturer manufacturer;
    Size sizeShoes;
    Double priseShoes;

    public Shoes(){ }

    public Shoes(Kind kindShoes, Type typeShoes, Color colorShoes, Manufacturer manufacturer, Size sizeShoes, Double priseShoes) {
        this.kindShoes = kindShoes;
        this.typeShoes = typeShoes;
        this.colorShoes = colorShoes;
        this.manufacturer = manufacturer;
        this.sizeShoes = sizeShoes;
        this.priseShoes = priseShoes;
    }

    public Kind getKindShoes() {
        return kindShoes;
    }

    public void setKindShoes(Kind kindShoes) {
        this.kindShoes = kindShoes;
    }

    public Type getTypeShoes() {
        return typeShoes;
    }

    public void setTypeShoes(Type typeShoes) {
        this.typeShoes = typeShoes;
    }

    public Color getColorShoes() {
        return colorShoes;
    }

    public void setColorShoes(Color colorShoes) {
        this.colorShoes = colorShoes;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Size getSizeShoes() {
        return sizeShoes;
    }

    public void setSizeShoes(Size sizeShoes) {
        this.sizeShoes = sizeShoes;
    }

    public Double getPriseShoes() {
        return priseShoes;
    }

    public void setPriseShoes(Double priseShoes) {
        this.priseShoes = priseShoes;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "kindShoes=" + kindShoes +
                ", typeShoes=" + typeShoes +
                ", colorShoes=" + colorShoes +
                ", manufacturer=" + manufacturer +
                ", sizeShoes=" + sizeShoes +
                ", priseShoes=" + priseShoes +
                '}'+"\n";
    }

    public enum Type {
        MAN,
        WOMAN
    }

    public enum Kind {
        SHOES,           //туфли
        SNEAKERS,        //кросовки
        BOOTS,           //сапоги
        TRIMMINGS        //босоножки
    }

    public enum Color {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        BLACK,
        WHITE
    }

    public enum Manufacturer {
        MANUFACTURER_1,
        MANUFACTURER_2,
        MANUFACTURER_3,
        MANUFACTURER_4
    }

    public enum Size {
        SIZE_1,
        SIZE_2,
        SIZE_3,
        SIZE_4
    }
}