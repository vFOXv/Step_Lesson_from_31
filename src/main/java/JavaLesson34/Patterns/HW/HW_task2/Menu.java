package JavaLesson34.Patterns.HW.HW_task2;

import java.util.Scanner;

public class Menu {
    public int menu() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("See the list of students \t 1");
        System.out.println("Add a student \t\t\t\t 2");
        System.out.println("Delete a student \t\t\t 3");
        System.out.println("Change student's data \t\t 4");
        System.out.println("Exit application \t\t\t 5");
        System.out.println();
        System.out.println("Choose action:");
        if (scanner.hasNextInt()) {
            int box = scanner.nextInt();
            if (box == 1 || box == 2 || box == 3 || box == 4 || box == 5) {
                return box;
            }
        } else {
            System.out.println("You enter not integer number");
            return 0;
        }
        return 0;
    }
}
