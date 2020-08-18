package JavaLesson35_MVC.Task3;

import java.util.Scanner;

public class Menu {
    int choice;
    int box;
    boolean flag;
    public int menu(){
        flag = true;
        while(flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add new article" + "\t\t\t" + "1");
            System.out.println("Remove article" + "\t\t\t" + "2");
            System.out.println("Change article" + "\t\t\t" + "3");
            System.out.println("Show all article" + "\t\t" + "4");
            System.out.println("Output"+"\t\t\t\t\t"+"5");
            if (scanner.hasNextInt()) {
                box = scanner.nextInt();
                if (box > 0 && box < 6) {
                    choice = box;
                    flag = false;
                } else {
                    System.err.println("You must enter number from 1 to 5 !!!");
                }
            }else{
                System.err.println("You must enter integer number!!!");
            }
        }
        return choice;
    }


}
