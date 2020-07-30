package JavaLesson34.Patterns.HW.HW_task1;

import java.util.Arrays;

public class ConcreteStrategyFindMax implements Strategy{
    @Override
    public int[] execute(int[] array) {
       int max = Arrays.stream(array)
               .max()
               .getAsInt();
       int arrayMax [] = {max};
       return arrayMax;
    }
}
