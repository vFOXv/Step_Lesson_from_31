package JavaLesson34.Patterns.HW.HW_task3;

import java.util.Arrays;

public class WorkWithArray {

    public void calculator(int [] buffer) {
//        try {
//            wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int sum = Arrays.stream(buffer)
                    .sum();

            int max = Arrays.stream(buffer)
                    .max()
                    .getAsInt();

            int min = Arrays.stream(buffer)
                    .min()
                    .getAsInt();

            System.out.println("Sum = " + sum);
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);

            try {
                Thread.sleep(4_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

