package JavaLesson32.HW;

import java.util.Map;
import java.util.TreeMap;

public class Actions {
    DataBaseProduct dataBaseProduct = new DataBaseProduct();

    //Мар для сбора списков товара покупки по виду скидки
    Map<String, Double> action0 = new TreeMap<String, Double>();
    Map<String, Double> action1 = new TreeMap<String, Double>();
    Map<String, Double> action2 = new TreeMap<String, Double>();
    Map<String, Double> action3 = new TreeMap<String, Double>();

    //проверка на наличее штрих кода в базе и создание Мар с штрих кодом и колличеством товара(0)
    public boolean checkBarCode(boolean result, String cacheBar) {
        boolean flag = true;

            if (result) {
                boolean cashBar = dataBaseProduct.dataBase.containsKey(cacheBar);
                if (cashBar) {
                    if (dataBaseProduct.dataBase.get(cacheBar).getAction() == 0) {
                        action0.put(cacheBar, 0.0);
                        return true;
                    } else if (dataBaseProduct.dataBase.get(cacheBar).getAction() == 1) {
                        action0.put(cacheBar, 0.0);
                        return true;
                    } else if (dataBaseProduct.dataBase.get(cacheBar).getAction() == 2) {
                        action0.put(cacheBar, 0.0);
                        return true;
                    } else if (dataBaseProduct.dataBase.get(cacheBar).getAction() == 3) {
                        action0.put(cacheBar, 0.0);
                        return true;
                    }
                } else {
                    System.err.println("This product hasn't in the base!!!");
                }
            }
        return false;
    }
}
