package JavaLesson33.Patterns.HW_task1;

import java.io.*;

public class Singleton {
    private static Singleton instance;
    public static byte[] buffer ;
    int call = 1;

    private Singleton() {
    }


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //метод записывает в файл String значения
    public void writeFile() {
        try (FileWriter firstInFail = new FileWriter("src\\main\\resources\\HW33_task1.txt",true)) {
            firstInFail.write("1 ");
            firstInFail.write("2 ");
            firstInFail.write("3 ");
            firstInFail.write("4 ");
            firstInFail.write("5 ");
            firstInFail.write("end ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //метод записывает значения из файла в массив byte
    public void writeArray(){
        //получаю стороку!!!!
        //переделать в масив byte
        File file = new File("src\\main\\resources\\HW33_task1.txt");
        byte [] bytesCashe = new byte[(int)file.length()];

        try(InputStream firstInArray = new FileInputStream(file)){
            firstInArray.read(bytesCashe);
            //очистка масива
            String strings [] = new String(bytesCashe).trim().split("\\D+");
            //задание длинны массива byte чисел
            buffer = new byte[strings.length];
            //запись цифр в int массив
            for (int i = 0; i < strings.length; i++) {
                buffer[i] =  Byte.parseByte(strings[i]);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        System.out.println("Вызов №"+ call+". HashCode object instance => "+instance.hashCode());
        //счетчик вызовов объекта instance
        call++;
        System.out.println("Распечатка всех цифр из файла.");
        for (byte aByte : buffer) {
            System.out.print(aByte + " ");
        }
        System.out.println();
    }

}
