package JavaLesson34.Patterns.HW.HW_task1;

import java.util.Arrays;

public class ConcreteStrategyFindMin implements Strategy{
    int arrayMin [];
    @Override
    public int[] execute(int[] array) {
        int min = Arrays.stream(array)
                .min()
                .getAsInt();
        int arrayMin [] = {min};
        return arrayMin;
    }
}
