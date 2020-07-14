package HW_2;

public class Calculator {
    public double sum(double first, double second) {
        return first + second;
    }

    public double subtraction(double first, double second) {
        return first - second;
    }

    public double multiplication(double first, double second) {
        return first * second;
    }

    public double division(double first, double second) {
        return first / second;
    }

    public double max(double first, double second) {
        return Math.max(first, second);
    }

    public double min(double first, double second) {
        return Math.min(first, second);
    }

    public double percent(double first, double second) {
        return (second / first) * 100;
    }

    public double degree(double first, double second) {
        return Math.pow(first, second);
    }
}
