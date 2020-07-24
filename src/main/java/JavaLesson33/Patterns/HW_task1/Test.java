package JavaLesson33.Patterns.HW_task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Lesson 27

public class Test {
    public static void main(String[] args) {
        File file = new File("src\\main\\resources\\HW33_task1.txt");
        byte[] bytes = new byte[(int)file.length()];
        try (FileInputStream inFile = new FileInputStream(file)) {
            inFile.read(bytes);
            inFile.close();
            String[] valueStr = new String(bytes).trim().split("\\s+");
            for (String s : valueStr) {
                System.out.println(s);
            }


        }catch (IOException e){
            System.out.println("ERROR");
        }


    }
}
