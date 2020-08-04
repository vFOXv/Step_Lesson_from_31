package JavaLesson34.Patterns.HW.HW_task3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class WorkWithFile {
    private static Logger log = Logger.getLogger(WorkWithFile.class.getName());

    //метод который записывает лдоги в файл:)))
    public void myLog(String mesager) {
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
        log.info(mesager);
    }

    //генерация нового набора цифр и запись их в файл с определеным периодом времени
    //Пять цифр от -100 до +100.
    public void newNumberWithFile() {
        myLog("Start method: newNumberWithFile()");
        try (FileWriter fileWriter = new FileWriter("src\\main\\resources\\HW34_task3_Sourse.txt")) {
            for (int i = 0; i < 5; i++) {
                int random = (int) (-100 + Math.random() * 201);
                fileWriter.write(random + "W ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
