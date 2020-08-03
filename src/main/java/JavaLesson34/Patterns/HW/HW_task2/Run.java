package JavaLesson34.Patterns.HW.HW_task2;

public class Run {
    //В каждом учебном заведении есть студенты. Студенты
    //входят в состав групп. Вам необходимо создать эмуляцию учебного процесса. Приложение должно позволять
    //добавлять, удалять, изменять информацию о студентах
    //и группах. При реализации используйте паттерн Iterator
    //(для отображения студентов, входящих в группу) и другие
    //необходимые паттерны.
    public static void main(String[] args) {
        Menu menu = new Menu();
        Logic logic = new Logic();

        while(true){
            switch(menu.menu()){
                case 1:
                    logic.iterator();
                    break;
                case 2:
                    logic.addStudent();
                    break;
                case 3:
                    logic.deleteStudent();
                    break;
                case 4:
                    logic.changeStudent();
                    break;
                case 5:
                    return;
            }
        }
    }

}
