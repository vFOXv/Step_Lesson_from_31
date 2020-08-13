package JavaLesson34.Patterns.HW.HW_task3;

public class LogicProxy implements InterfaceLogic {
    Logic logic = new Logic();

    @Override
    public void fullFile() {
        logic.workWithFile.myLog("Start method fullFile");
        logic.fullFile();
        logic.workWithFile.myLog("Finish method fullFile");
    }

    @Override
    public void workData() {
        logic.workWithFile.myLog("Start method workData");
        logic.workData();
        logic.workWithFile.myLog("Finish method workData");
    }
}
