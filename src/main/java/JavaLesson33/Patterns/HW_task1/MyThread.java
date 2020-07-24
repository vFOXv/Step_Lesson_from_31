package JavaLesson33.Patterns.HW_task1;

import java.io.*;

public class MyThread {

    Singleton singleton = Singleton.getInstance();

    byte threadArray [] = singleton.buffer;

    public void inFileSecond(){

//        try(ByteArrayOutputStream firstFile = new ByteArrayOutputStream(threadArray.length )) {
//
//        }

    }
}
//new FileOutputStream("src\\main\\resources\\HW33_task1.txt")