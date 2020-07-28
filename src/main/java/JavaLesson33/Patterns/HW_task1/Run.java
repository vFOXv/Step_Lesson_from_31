package JavaLesson33.Patterns.HW_task1;

public class Run {
    //Создайте классическую реализацию паттерна Singleton.
    //Протестируйте работу созданного класса.
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.writeFile();
        singleton.writeArray();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.writeFile();
        singleton1.writeArray();
        //вызов №1 - singleton
        //вызов №2 - singleton1
    }
}
