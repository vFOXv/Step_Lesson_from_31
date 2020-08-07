package JavaLesson34.Patterns.HW.HW_task3;

public class LogicProxy implements InterfaceLogic {
    Logic logic = new Logic();

    @Override
    public void fullFile() {
        logic.fullFile();
    }

    @Override
    public void workData() {
        logic.workData();
    }
}
