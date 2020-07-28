package JavaLesson33.Patterns.HW_task4;

public class PastaFactory {
    public Pasta getPasta(MyEnum.numberDish dish){
        Pasta myPasta = null;
        switch(dish){
            case ONE:
                myPasta = new OnePasta();
                break;
            case TWO:
                myPasta = new TwoPasta();
                break;
            case THREE:
                myPasta = new ThreePasta();
                break;
            case FOUR:
                myPasta = new FourPasta();
                break;
                default:
                    throw new IllegalArgumentException("Ошибка ввода типа блюда: "+ dish);
        }
        return myPasta;
    }
}
