package JavaLesson34.Patterns.HW.HW_task1;

import java.util.Scanner;

public class Menu {
    int choose;

    public int menu() {
        int cash = 0;
        Scanner scanner = null;
        while (cash <= 0 || cash > 6) {
            System.out.println("Array show in terminal"+ "\t\t"+"1");
            System.out.println("Array show in file"+ "\t\t\t"+"2");
            System.out.println("Data flip in array"+"\t\t\t"+"3");
            System.out.println("Show min value in array"+"\t\t"+"4");
            System.out.println("Show max value in array"+"\t\t"+"5");
            scanner = new Scanner(System.in);
            System.out.println("Choose action:");
            if (scanner.hasNextInt()) {
                cash = scanner.nextInt();
                if (cash > 0 && cash < 6) {
                    choose = cash;
                    //cash = 0;
                } else {
                    System.err.println("You enter not valid value!!!");
                }
            } else {
                System.err.println("You enter not valid value!!!");
            }
        }
        return choose;
    }
}
