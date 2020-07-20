package JavaLesson32.HW;

public class Product {
    String name;
    Double prise;
    String unit;        //единица измерения
    String barcode;     //Уменьшил длину штрих кода до 3 значений(для удобства)
    int action;         //тип акции

    public Product() {
    }

    public Product(String name, Double prise, String unit, /*String barcode,*/ int action) {
        this.name = name;
        this.prise = prise;
        this.unit = unit;
        //this.barcode = barcode;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int length = name.length();
        if (length >= 3 && length <= 250) {
            this.name = name;
        } else if (length < 3) {
            System.err.println("Length must > 2 chars!!!");
        } else if (length > 250) {
            System.out.println("Length must < 250 char!!!");
        }
    }

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        if (prise >= 0.01) {
            this.prise = prise;
        } else {
            System.err.println("Prise must > 0!!!");
        }
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        int length = unit.length();
        if (length >= 2 && length <= 5) {
            this.unit = unit;
        } else if (length < 2) {
            System.err.println("Length must > 1 chars!!!");
        } else if (length > 5) {
            System.out.println("Length must < 6 char!!!");
        }
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        boolean result = barcode.matches("^\\d{3}$");
        if(result) {
            this.barcode = barcode;
        }else{
            System.err.println("Barcode must has 3 numbers!!!");
        }
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        if(action>=0 && action<=4) {
            this.action = action;
        }else{
            System.err.println("Action must be 0 - 4!!!");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", unit='" + unit + '\'' +
                ", action=" + action +
                '}'+"\n";
    }
}
