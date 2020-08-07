package JavaLesson34.Patterns.HW.HW_task3;

import java.io.*;
import java.util.Arrays;
import java.util.logging.*;

public class WorkWithFile {
    private static Logger log = Logger.getLogger(WorkWithFile.class.getName());
    public static int[] buffer;

    //метод который записывает логи в файл:)))
    public void myLog(String message) {
//        try {
//            LogManager.getLogManager().readConfiguration(WorkWithFile.class.getResourceAsStream("src\\main\\resources\\logging.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            Handler fileHandler = new FileHandler("src\\main\\resources\\Log.txt", true);
            log.setUseParentHandlers(false);
            log.addHandler(fileHandler);


        } catch (IOException e) {
            log.log(Level.SEVERE, "Exception: ", e);
            e.printStackTrace();
        }
        log.info(message);
    }

    //считывание данных с файла
    public int[] readFile(int[] buffer) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myLog("Start method: readFile()");

//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }


            //получаю стороку!!!!
            //переделать в масив byte
            File file = new File("src\\main\\resources\\HW34_task3_Source.txt");
            byte[] bytesTMP = new byte[(int) file.length()];

            try (InputStream InArray = new FileInputStream(file)) {
                InArray.read(bytesTMP);
                //очистка масива
                String strings[] = new String(bytesTMP).trim().split("[^\\d-]+");
                //задание длинны массива byte чисел
                buffer = new int[strings.length];
                //запись цифр в int массив
                for (int i = 0; i < strings.length; i++) {
                    buffer[i] = Integer.parseInt(strings[i]);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
            System.out.println("Распечатка всех цифр из файла.");
            for (int num : buffer) {
                System.out.print(num + " ");
            }
            System.out.println();

            try {
                Thread.sleep(4_500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return buffer;
        }



    //генерация нового набора цифр и запись их в файл с определеным периодом времени
    //Пять цифр от -100 до +100.
    public void newNumberWithFile() {
        while (true) {
            myLog("Start method: newNumberWithFile()");
            try (FileWriter fileWriter = new FileWriter("src\\main\\resources\\HW34_task3_Source.txt")) {
                for (int i = 0; i < 5; i++) {
                    int random = (int) (-100 + Math.random() * 201);
                    fileWriter.write(random + " W ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //System.out.println("Pleas, wait 5 seconds :)");
            try {
                Thread.sleep(5_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            notifyAll();
        }
    }
}
