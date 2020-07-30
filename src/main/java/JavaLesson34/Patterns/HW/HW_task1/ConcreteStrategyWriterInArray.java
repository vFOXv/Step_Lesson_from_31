package JavaLesson34.Patterns.HW.HW_task1;

import java.io.*;

public class ConcreteStrategyWriterInArray implements Strategy {
    private byte[] buffer;

    @Override
    public int[] execute(int[] array) {
        File file = new File("src\\main\\resources\\HW34_Task1_Source.txt");
        byte[] bytesCash = new byte[(int) file.length()];
        try (InputStream inputStream = new FileInputStream("src\\main\\resources\\HW34_Task1_Source.txt")) {
            inputStream.read(bytesCash);
            //очистка масива
            String strings[] = new String(bytesCash).trim().split("[^\\d-]+");
            //задание длинны массива array
            array = new int[strings.length];
            //запись цифр в int массив
            for (int i = 0; i < strings.length; i++) {
                array[i] = Integer.parseInt(strings[i]);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return array;
    }
}
