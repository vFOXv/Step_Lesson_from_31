package JavaLesson34.Patterns.HW.HW_task1;

import java.io.FileWriter;
import java.io.IOException;

public class ConcreteStrategyShowArrayFile implements Strategy{
    //метод записывает в файл String значения
    @Override
    public int [] execute(int[] array) {

            try(FileWriter myWriter = new FileWriter("src\\main\\resources\\HW34_task1_Show.txt",false)){
                for (int i = 0; i <array.length ; i++) {
                    myWriter.write(Integer.toString(array[i])+" ");
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
            return array;
    }
}
