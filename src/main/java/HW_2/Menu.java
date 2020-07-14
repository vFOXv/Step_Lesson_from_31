package HW_2;

import java.util.Scanner;

public class Menu {
    double first;
    double second;

    public int chooseAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose action: +, -, *, /, max, min, %, ^, stop");
        String myLine = scanner.next();
        if(myLine.equalsIgnoreCase("+")){
            return 1;
        }else if(myLine.equalsIgnoreCase("-")){
            return 2;
        }else if(myLine.equalsIgnoreCase("*")){
            return 3;
        }else if(myLine.equalsIgnoreCase("/")){
            return 4;
        }else if(myLine.equalsIgnoreCase("max")){
            return 5;
        }else if(myLine.equalsIgnoreCase("min")){
            return 6;
        }else if(myLine.equalsIgnoreCase("%")){
            return 7;
        }else if(myLine.equalsIgnoreCase("^")){
            return 8;
        }else if(myLine.equalsIgnoreCase("stop")){
            return 9;
        }else{
            return 10;
        }
    }
}
