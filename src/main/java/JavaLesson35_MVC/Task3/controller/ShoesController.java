package JavaLesson35_MVC.Task3.controller;

import JavaLesson35_MVC.Task3.dao.ShoesDaoIml;
import JavaLesson35_MVC.Task3.model.Shoes;
import JavaLesson35_MVC.Task3.model.factory.ShoesFactory;
import JavaLesson35_MVC.Task3.view.ShoesView;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ShoesController {
    Integer key;
    Shoes shoes;
    ShoesDaoIml shoesDao = new ShoesDaoIml();
    ShoesFactory shoesFactory = new ShoesFactory();

    public ShoesController() {
        //метод создающий дефолтный список обуви
        createDefaultListShoes();
    }


    //Map содержащая список обуви
    TreeMap<Integer, Shoes> myShoesClone = (TreeMap<Integer, Shoes>) shoesDao.getMyMap();

    //Set содержащий список ключей
    Set<Integer> keys = (Set<Integer>) shoesDao.getMyKey();

    //метод создающий дефолтный список обуви
    public void createDefaultListShoes(){
        //создание нового объекта при помощи фабрики
        Shoes shoes1 = shoesFactory.createShoes(Shoes.Kind.SHOES,Shoes.Type.MAN,Shoes.Color.BLACK,Shoes.Manufacturer.MANUFACTURER_1,Shoes.Size.SIZE_1,10.0);
        shoesDao.getMyMap().put(1, shoes1);

        Shoes shoes2 = shoesFactory.createShoes(Shoes.Kind.BOOTS,Shoes.Type.WOMAN,Shoes.Color.BLUE,Shoes.Manufacturer.MANUFACTURER_2,Shoes.Size.SIZE_2,20.0);
        shoesDao.getMyMap().put(2, shoes2);

        Shoes shoes3 = shoesFactory.createShoes(Shoes.Kind.SNEAKERS,Shoes.Type.MAN,Shoes.Color.GREEN,Shoes.Manufacturer.MANUFACTURER_3,Shoes.Size.SIZE_3,30.0);
        shoesDao.getMyMap().put(3, shoes3);

        Shoes shoes4 = shoesFactory.createShoes(Shoes.Kind.TRIMMINGS,Shoes.Type.WOMAN,Shoes.Color.ORANGE,Shoes.Manufacturer.MANUFACTURER_4,Shoes.Size.SIZE_4,40.0);
        shoesDao.getMyMap().put(4, shoes4);
    }

    //метод создающий список (Set) ключей и обновляющий список ключей после добавления и удаления объектов
    public void createListKeys() {
        shoesDao.getMyKey();
    }

    //метод генирирующий новый свободный ключ при создании объекта
    public int createNewKey() {
        int newKey = keys.stream()
                .min(Integer::compareTo)
                .get();
        if (newKey <= 1) {
            newKey = keys.stream()
                    .max(Integer::compareTo)
                    .get();
            return (newKey + 1);
        }
        return (newKey - 1);
    }

//    //получние вида обуви
//    public Shoes.Kind getMyKind() {
//        Shoes.Kind kind = null;
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Choose kind shoes:" + "\n" + "1 SHOES" + "\n" + "2 SNEAKERS" + "\n" + "3 BOOTS" + "\n" + "4 TRIMMINGS");
//            if (scanner.hasNextInt()) {
//                int box = scanner.nextInt();
//                if (box >= 1 && box <= 4) {
//                    switch (box) {
//                        case 1:
//                            return Shoes.Kind.SHOES;
//                        case 2:
//                            return Shoes.Kind.SNEAKERS;
//                        case 3:
//                            return Shoes.Kind.BOOTS;
//                        case 4:
//                            return Shoes.Kind.TRIMMINGS;
//                    }
//                    }else{
//                    System.err.println("You must enter a number from 1 to 4!!!");
//                }
//            }else{
//                System.err.println("You enter not integer number!!!");
//            }
//        }
//    }
//
//    //получние типа обуви
//    public Shoes.Type getMyType() {
//        Shoes.Type type = null;
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Choose type shoes:" + "\n" + "1 MAN" + "\n" + "2 WOMAN");
//            if (scanner.hasNextInt()) {
//                int box = scanner.nextInt();
//                if (box >= 1 && box <= 2) {
//                    switch (box) {
//                        case 1:
//                            return Shoes.Type.MAN;
//                        case 2:
//                            return Shoes.Type.WOMAN;
//                    }
//                }else{
//                    System.err.println("You must enter a number from 1 to 2!!!");
//                }
//            }else{
//                System.err.println("You enter not integer number!!!");
//            }
//        }
//    }
//
//    //получние цвета обуви
//    public Shoes.Color getMyColor() {
//        Shoes.Color color = null;
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Choose color shoes:" + "\n" + "1 RED" + "\n" + "2 ORANGE" + "\n" + "3 YELLOW" + "\n" + "4 GREEN"+ "\n" + "5 BLUE"+ "\n" + "6 BLACK"+ "\n" + "7 WHITE");
//            if (scanner.hasNextInt()) {
//                int box = scanner.nextInt();
//                if (box >= 1 && box <= 7) {
//                    switch (box) {
//                        case 1:
//                            return Shoes.Color.RED;
//                        case 2:
//                            return Shoes.Color.ORANGE;
//                        case 3:
//                            return Shoes.Color.YELLOW;
//                        case 4:
//                            return Shoes.Color.GREEN;
//                        case 5:
//                            return Shoes.Color.BLUE;
//                        case 6:
//                            return Shoes.Color.BLACK;
//                        case 7:
//                            return Shoes.Color.WHITE;
//                    }
//                }else{
//                    System.err.println("You must enter a number from 1 to 7!!!");
//                }
//            }else{
//                System.err.println("You enter not integer number!!!");
//            }
//        }
//    }
//
//    //получние производителя обуви
//    public Shoes.Manufacturer getMyManufacturer() {
//        Shoes.Manufacturer manufacturer = null;
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Choose manufacturer shoes:" + "\n" + "1 Manufacturer_1" + "\n" + "2 Manufacturer_2" + "\n" + "3 Manufacturer_3" + "\n" + "4 Manufacturer_4");
//            if (scanner.hasNextInt()) {
//                int box = scanner.nextInt();
//                if (box >= 1 && box <= 4) {
//                    switch (box) {
//                        case 1:
//                            return Shoes.Manufacturer.MANUFACTURER_1;
//                        case 2:
//                            return Shoes.Manufacturer.MANUFACTURER_2;
//                        case 3:
//                            return Shoes.Manufacturer.MANUFACTURER_3;
//                        case 4:
//                            return Shoes.Manufacturer.MANUFACTURER_4;
//                    }
//                }else{
//                    System.err.println("You must enter a number from 1 to 4!!!");
//                }
//            }else{
//                System.err.println("You enter not integer number!!!");
//            }
//        }
//    }
//
//    //получние размера обуви
//    public Shoes.Size getMySize() {
//        Shoes.Size size = null;
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Choose size shoes:" + "\n" + "1 SIZE_1" + "\n" + "2 SIZE_2" + "\n" + "3 SIZE_3" + "\n" + "4 SIZE_4");
//            if (scanner.hasNextInt()) {
//                int box = scanner.nextInt();
//                if (box >= 1 && box <= 4) {
//                    switch (box) {
//                        case 1:
//                            return Shoes.Size.SIZE_1;
//                        case 2:
//                            return Shoes.Size.SIZE_2;
//                        case 3:
//                            return Shoes.Size.SIZE_3;
//                        case 4:
//                            return Shoes.Size.SIZE_4;
//                    }
//                }else{
//                    System.err.println("You must enter a number from 1 to 4!!!");
//                }
//            }else{
//                System.err.println("You enter not integer number!!!");
//            }
//        }
//    }
//
//    //получение цены обуви
//    public double getMyPrise(){
//        double prise = 0;
//        while(true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter prise shoes:");
//            if(scanner.hasNextDouble()){
//                double box = scanner.nextDouble();
//                if(box>0){
//                    prise = box;
//                    return prise;
//                }else{
//                    System.err.println("Prise must be > 0!!!");
//                }
//            }else{
//                System.err.println("You enter not double number!!!");
//            }
//        }
//    }

    //метод добовляющий новые объекты "обувь"
    public void add() {
        //получение вида обуви - getMyKind()
        //получение типа обуви - getMyType()
        //получение цвета обуви - getMyColor();
        //получение производителя обуви - getMyManufacturer()
        //получение размера обуви - getMySize()
        //получение цены обуви - getMyPrise()

        //создание нового объекта при помощи фабрики
        shoes = shoesFactory.createShoes(ShoesView.getMyKind(),ShoesView.getMyType(),ShoesView.getMyColor(),ShoesView.getMyManufacturer(),ShoesView.getMySize(),ShoesView.getMyPrise());

        //создание нового ключа createNewKey()
        Integer flag = shoesDao.myAdd(createNewKey(), shoes);
        //проверка на наличее ключа в Map
        if (shoesDao.getMyMap().containsKey(flag)) {
            System.out.println("Shoes add in the list. Key = "+ flag);
        } else {
            //если ключ уже есть, то объект обувь перезапишеться по этому ключу
            System.err.println("This shoes's id already was in the list!!! Key = "+ flag);
        }
    }

    //метод удаляющий объект обувь по ключу
    public void remove() {
        int key=0;
        System.out.println("Enter key shoes for remove:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int box = scanner.nextInt();
            //проверка на наличее ключа в Map
            if(shoesDao.getMyMap().containsKey(box)){
                key = box;
                shoesDao.myRemove(key);
                System.out.println("Shoes have key = "+ key+ " delete!"+"\n" );
            }else{
                System.err.println("This key is not in the list!!!");
            }
        }else{
            System.err.println("You enter not integer number!!!");
        }
    }

    //метод изменяющий объект обувь по ключу
    public void change(){
        int key=0;
        System.out.println("Enter key shoes for change:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int box = scanner.nextInt();
            //проверка на наличее ключа в Map
            if(shoesDao.getMyMap().containsKey(box)){
                key = box;
                //создание нового объекта при помощи фабрики
                shoes = shoesFactory.createShoes(ShoesView.getMyKind(),ShoesView.getMyType(),ShoesView.getMyColor(),ShoesView.getMyManufacturer(),ShoesView.getMySize(),ShoesView.getMyPrise());
                shoesDao.myChange(key, shoes);
                System.out.println("Shoes have key = "+ key+ " change!  \n" );
            }else{
                System.err.println("This key is not in the list!!!");
            }
        }else{
            System.err.println("You enter not integer number!!!");
        }
    }

    //метод показывающий весь список объектов обуви
    public void show(){
        shoesDao.myShowAll();
    }
}
