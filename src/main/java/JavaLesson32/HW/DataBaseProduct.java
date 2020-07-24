package JavaLesson32.HW;

import java.util.Map;
import java.util.TreeMap;

public class DataBaseProduct {
    public Product product;
    public Map<String, Product> dataBase;

    public DataBaseProduct(){
        product = new Product();
        createDataBase();
    }
    public void createDataBase() {
        dataBase = new TreeMap<String, Product>();

        //создание дефолтной базы продуктов
        dataBase.put("001", new Product("Bread", 20.15, "thing"/*штука*/, 0));
        dataBase.put("002", new Product("Apple", 120.01, "kg", 1));
        dataBase.put("003", new Product("Chary", 87.12, "kg", 3));
        dataBase.put("004", new Product("Orange", 250.87, "kg", 2));
        dataBase.put("005", new Product("Shekoladny tile", 58.03, "thing", 0));
        dataBase.put("006", new Product("Biscuits Sun", 45.18, "paskage", 1));
        dataBase.put("007", new Product("Veal"/*телятина*/, 230.60, "kg",2));
        dataBase.put("008", new Product("Cheese", 340.78,"kg",3));
        dataBase.put("009", new Product("Milk", 54.17,"litre",1));
        dataBase.put("010",new Product("Pork"/*свинина*/, 296.00, "kg",2));
        dataBase.put("011",new Product("Potato", 64.12,"kg",3));
    }
}
