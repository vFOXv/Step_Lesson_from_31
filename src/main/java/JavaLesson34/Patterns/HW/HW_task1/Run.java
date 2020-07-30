package JavaLesson34.Patterns.HW.HW_task1;

public class Run {
    public static void main(String[] args) {
        //Создайте класс, выполняющий операции с массивом:
        //отображение данных в файл или на экран, переворот
        //данных, нахождение максимума, нахождение минимума. Класс может получить набор значений с клавиатуры
        //или из файла. При реализации используйте паттерн
        //Strategy и другие необходимые паттерны.
//        int array[] = new int[5];
        int array[] = null;
        ConcreteStrategyWriterInArray writerInArray = new ConcreteStrategyWriterInArray();
        ConcreteStrategyShowArrayTerminal showArrayTerminal = new ConcreteStrategyShowArrayTerminal();
        ConcreteStrategyShowArrayFile showArrayFile = new ConcreteStrategyShowArrayFile();
        ConcreteStrategyDataFlip dataFlip = new ConcreteStrategyDataFlip();
        ConcreteStrategyFindMin findMin = new ConcreteStrategyFindMin();
        ConcreteStrategyFindMax findMax = new ConcreteStrategyFindMax();
        Menu menu = new Menu();

        //запись данных из файла в массив array
        //array !!!=!!! writerInArray.execute(array) - перезапись массива в более высокой облости видимости
        //действие происходит по умолчанию
        array = writerInArray.execute(array);

        while (true) {
            menu.menu();
            switch (menu.choose) {
                case 1:
                    showArrayTerminal.execute(array);
                    System.out.println();
                    break;
                case 2:
                    //----------------!!!!!!  --------- вопрос - почему значения в файл записываються только
                    //----------------!!!!!!  --------- после завершения работы программы???
                    System.out.println("Looking in the file :)");
                    showArrayFile.execute(array);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Переворот данных.");
                    //array !!!=!!! dataFlip.execute(array) - перезапись массива в более высокой облости видимости
                    array = dataFlip.execute(array);
                    showArrayTerminal.execute(array);
                    showArrayFile.execute(array);
                    System.out.println();
                    break;
                case 4:
                    //метод возвращает массив с length = 1 содержащие min значение массива
                    System.out.println("Min value = " + findMin.execute(array)[0]);
                    System.out.println();
                    break;
                case 5:
                    //метод возвращает массив с length = 1 содержащие max значение массива
                    System.out.println("Max value = " + findMax.execute(array)[0]);
                    System.out.println();
                    break;
            }
        }
    }
}
