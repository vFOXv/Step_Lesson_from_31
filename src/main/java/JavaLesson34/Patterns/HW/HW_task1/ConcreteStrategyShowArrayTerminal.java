package JavaLesson34.Patterns.HW.HW_task1;

public class ConcreteStrategyShowArrayTerminal implements Strategy{

    @Override
    public int [] execute(int array []) {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return array;
    }
}
