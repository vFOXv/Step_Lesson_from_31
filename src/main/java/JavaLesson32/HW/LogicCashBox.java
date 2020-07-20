package JavaLesson32.HW;

import JavaLesson32.HW.DataBaseProduct;

import java.util.Scanner;

public class LogicCashBox {
    DataBaseProduct dataBaseProduct;

    public LogicCashBox() {
        dataBaseProduct = new DataBaseProduct();
    }

    public void enterBarCode() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter product's bar code:");
            String cache = scanner.nextLine();
            boolean result = cache.matches("^(0*)\\d{2}$");
            if(result) {
                //проверка на наличее штрих кода в базе
                boolean cashBar = dataBaseProduct.dataBase.containsKey(cache);
                if(cashBar){


                }else{
                    System.err.println("This product hasn't in the base!!!");
                }
            }else{
                System.err.println("Barcode is not valid!!!");
            }
        }
    }
}
