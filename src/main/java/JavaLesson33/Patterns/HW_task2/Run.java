package JavaLesson33.Patterns.HW_task2;

import org.w3c.dom.ls.LSOutput;

public class Run {
    //Создайте классическую реализацию паттерна Singleton.
    //Протестируйте работу созданного класса.
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        Thread thread1 = new Thread(()->{
            Thread.currentThread().setName("Thread 1");
            singleton1.writeFile();
            singleton1.writeArray();
            System.out.println(Thread.currentThread().getName());
        });

        Thread thread2 = new Thread(()->{
            Thread.currentThread().setName("Thread 2");
            singleton2.writeFile();
            singleton2.writeArray();
            System.out.println(Thread.currentThread().getName());
        });

        thread1.start();
        thread2.start();

        //вызовы только №1 - в каждом потоке вызов идет один раз, поэтому счетчик показывает только первый вызов объекта
    }
}
