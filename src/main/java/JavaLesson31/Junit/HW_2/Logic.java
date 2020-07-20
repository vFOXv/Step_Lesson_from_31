package JavaLesson31.Junit.HW_2;

import java.util.Scanner;

public class Logic {
    double first;
    double second;
    Menu menu;
    Calculator calculator;

    public Logic() {
        menu = new Menu();
        calculator = new Calculator();
    }


    public void workCalculator() {
        while (true) {
            int action = menu.chooseAction();
            switch (action) {
                case 1:
                    scan();
                    System.out.println(calculator.sum(first, second));
                    break;
                case 2:
                    scan();
                    System.out.println(calculator.subtraction(first, second));
                    break;
                case 3:
                    scan();
                    System.out.println(calculator.multiplication(first, second));
                    break;
                case 4:
                    scan();
                    System.out.println(calculator.division(first, second));
                    break;
                case 5:
                    scan();
                    System.out.println(calculator.max(first, second));
                    break;
                case 6:
                    scan();
                    calculator.min(first, second);
                    break;
                case 7:
                    scan();
                    System.out.println(calculator.percent(first, second));
                    break;
                case 8:
                    scan();
                    System.out.println(calculator.degree(first, second));
                    break;
                case 9:
                    return;
                case 10:
                    System.err.println("You enter not valid value!!!");
                    break;
            }
        }
    }

    public void scan() {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            if (scanner.hasNextDouble()) {
                first = scanner.nextDouble();
                flag = false;
            } else {
                System.err.println("You enter not number!!!");
            }
        }

        flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter second number: ");
            if (scanner.hasNextDouble()) {
                second = scanner.nextDouble();
                flag = false;
            } else {
                System.err.println("You enter not number!!!");
            }
        }
    }
}
