package JavaLesson34.Patterns.HW.HW_task3;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class RunLog {
    //Есть класс, предоставляющий доступ к набору чисел.
    //Источником этого набора чисел является некоторый файл.
    // С определенной периодичностью данные в файле
    //меняются (надо реализовать механизм обновления).
    //Приложение должно получать доступ к этим данным
    //и выполнять набор операций над ними (сумма, максимум,
    //минимум и т.д.). При каждой попытке доступа к этому
    //набору необходимо вносить запись в лог-файл.
    // При реализации используйте паттерн Proxy (для логгирования)
    //и другие необходимые паттерны.

    public static void main(String[] args) {

        //-----!!!!!------   ворпросы в классе Logic!!!!!!!

        LogicProxy logicProxy = new LogicProxy();
        logicProxy.fullFile();
        logicProxy.workData();
    }
}
