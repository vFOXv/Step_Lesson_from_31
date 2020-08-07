package JavaLesson34.Patterns.HW.HW_task3;

public class Logic implements InterfaceLogic{
    WorkWithFile workWithFile = new WorkWithFile();
    WorkWithArray workWithArray = new WorkWithArray();

    //------!!!!!----- при использовании notify()/wait() все падает с ошибкой IllegalMonitorStateException ?????????
    //------!!!!!----- как убрать образование левых логов????
    //------!!!!!----- как чистить файл логов из идеи????   переодически он становиться доступным только для чтения.

    public void fullFile() {
        Thread threadFullFile = new Thread(() -> {
            workWithFile.newNumberWithFile();
        });
        threadFullFile.start();
    }

    public void workData() {
        Thread threadOutPut = new Thread(() -> {
            while (true) {
                workWithFile.buffer = workWithFile.readFile(workWithFile.buffer);
                //-----не могу передать данные между потоками(в одном потоке массив полный, во вторим пустой)
                workWithArray.calculator(workWithFile.buffer);
            }
        });
        threadOutPut.start();
    }
}
