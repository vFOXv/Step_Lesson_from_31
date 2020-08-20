package JavaLesson35_MVC.Task3.view;

import JavaLesson35_MVC.Task1.Menu;
import JavaLesson35_MVC.Task1.controller.ArticleController;
import JavaLesson35_MVC.Task3.controller.ShoesController;
import JavaLesson35_MVC.Task3.model.Shoes;

import java.util.Scanner;

public class ShoesView {
   ShoesController shoesController = new ShoesController();
    Menu menu = new Menu();

    //получние вида обуви
    public static Shoes.Kind getMyKind() {
        Shoes.Kind kind = null;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose kind shoes:" + "\n" + "1 SHOES" + "\n" + "2 SNEAKERS" + "\n" + "3 BOOTS" + "\n" + "4 TRIMMINGS");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                if (box >= 1 && box <= 4) {
                    switch (box) {
                        case 1:
                            return Shoes.Kind.SHOES;
                        case 2:
                            return Shoes.Kind.SNEAKERS;
                        case 3:
                            return Shoes.Kind.BOOTS;
                        case 4:
                            return Shoes.Kind.TRIMMINGS;
                    }
                }else{
                    System.err.println("You must enter a number from 1 to 4!!!");
                }
            }else{
                System.err.println("You enter not integer number!!!");
            }
        }
    }

    //получние типа обуви
    public static Shoes.Type getMyType() {
        Shoes.Type type = null;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose type shoes:" + "\n" + "1 MAN" + "\n" + "2 WOMAN");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                if (box >= 1 && box <= 2) {
                    switch (box) {
                        case 1:
                            return Shoes.Type.MAN;
                        case 2:
                            return Shoes.Type.WOMAN;
                    }
                }else{
                    System.err.println("You must enter a number from 1 to 2!!!");
                }
            }else{
                System.err.println("You enter not integer number!!!");
            }
        }
    }

    //получние цвета обуви
    public static Shoes.Color getMyColor() {
        Shoes.Color color = null;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose color shoes:" + "\n" + "1 RED" + "\n" + "2 ORANGE" + "\n" + "3 YELLOW" + "\n" + "4 GREEN"+ "\n" + "5 BLUE"+ "\n" + "6 BLACK"+ "\n" + "7 WHITE");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                if (box >= 1 && box <= 7) {
                    switch (box) {
                        case 1:
                            return Shoes.Color.RED;
                        case 2:
                            return Shoes.Color.ORANGE;
                        case 3:
                            return Shoes.Color.YELLOW;
                        case 4:
                            return Shoes.Color.GREEN;
                        case 5:
                            return Shoes.Color.BLUE;
                        case 6:
                            return Shoes.Color.BLACK;
                        case 7:
                            return Shoes.Color.WHITE;
                    }
                }else{
                    System.err.println("You must enter a number from 1 to 7!!!");
                }
            }else{
                System.err.println("You enter not integer number!!!");
            }
        }
    }

    //получние производителя обуви
    public static Shoes.Manufacturer getMyManufacturer() {
        Shoes.Manufacturer manufacturer = null;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose manufacturer shoes:" + "\n" + "1 Manufacturer_1" + "\n" + "2 Manufacturer_2" + "\n" + "3 Manufacturer_3" + "\n" + "4 Manufacturer_4");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                if (box >= 1 && box <= 4) {
                    switch (box) {
                        case 1:
                            return Shoes.Manufacturer.MANUFACTURER_1;
                        case 2:
                            return Shoes.Manufacturer.MANUFACTURER_2;
                        case 3:
                            return Shoes.Manufacturer.MANUFACTURER_3;
                        case 4:
                            return Shoes.Manufacturer.MANUFACTURER_4;
                    }
                }else{
                    System.err.println("You must enter a number from 1 to 4!!!");
                }
            }else{
                System.err.println("You enter not integer number!!!");
            }
        }
    }

    //получние размера обуви
    public static Shoes.Size getMySize() {
        Shoes.Size size = null;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose size shoes:" + "\n" + "1 SIZE_1" + "\n" + "2 SIZE_2" + "\n" + "3 SIZE_3" + "\n" + "4 SIZE_4");
            if (scanner.hasNextInt()) {
                int box = scanner.nextInt();
                if (box >= 1 && box <= 4) {
                    switch (box) {
                        case 1:
                            return Shoes.Size.SIZE_1;
                        case 2:
                            return Shoes.Size.SIZE_2;
                        case 3:
                            return Shoes.Size.SIZE_3;
                        case 4:
                            return Shoes.Size.SIZE_4;
                    }
                }else{
                    System.err.println("You must enter a number from 1 to 4!!!");
                }
            }else{
                System.err.println("You enter not integer number!!!");
            }
        }
    }

    //получение цены обуви
    public static double getMyPrise(){
        double prise = 0;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter prise shoes:");
            if(scanner.hasNextDouble()){
                double box = scanner.nextDouble();
                if(box>0){
                    prise = box;
                    return prise;
                }else{
                    System.err.println("Prise must be > 0!!!");
                }
            }else{
                System.err.println("You enter not double number!!!");
            }
        }
    }

    public void Actions() {
        while (true) {
            switch (menu.menu()) {
                case 1:
                    shoesController.add();
                    break;
                case 2:
                    shoesController.remove();
                    break;
                case 3:
                    shoesController.change();
                    break;
                case 4:
                    shoesController.show();
                    break;
                case 5:
                    return;
            }
        }
    }
}
