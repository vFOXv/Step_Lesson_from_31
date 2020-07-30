package JavaLesson34.Patterns.HW.HW_task1;

public class ConcreteStrategyDataFlip implements Strategy {
    //метод перезапичсывает массив в обратном порядке
    @Override
    public int [] execute(int[] array) {
        int myArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = array[array.length - (i+1)];
        }
        array = myArray;
        return array;
    }
}
