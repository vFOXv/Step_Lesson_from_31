package JavaLesson32.HW;

import java.util.Scanner;

public class LogicCashBox {
    DataBaseProduct dataBaseProduct;
    Actions actions;


    public LogicCashBox() {
        dataBaseProduct = new DataBaseProduct();
        actions = new Actions();
    }

    public void enterBarCode() {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter product's bar code:");
            String cacheBar = scanner.nextLine();
            boolean result = cacheBar.matches("^(0*)\\d{2}$");
            actions.checkBarCode(result, cacheBar);
        }
    }
}
