package HW_2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    static Calculator calculator;
    double first;
    double second;

    @BeforeClass
    public static void beforeClass() {
        calculator = new Calculator();
        System.out.println("BeforeClass test");
    }

    @Before
    public void before(){
        first = 10.3;
        second = 2.5;
    }

    @Test
    public void sum() {
        double res = calculator.sum(first,second);
        double exp = 25.75;
        System.out.println("res = "+res +" / " + "exp ="+exp);
        Assert.assertEquals(exp,res,0.01 );
    }

    @Test
    public void subtraction() {
        double res = calculator.subtraction(first,second);
        double exp = 7.8;
        System.out.println("res = "+res +" / " + "exp ="+exp);
        Assert.assertEquals(exp,res,0.01 );
    }

    @Test
    public void multiplication() {
        double res = calculator.multiplication(first,second);
        double exp = 25.75;
        System.out.println("res = "+res +" / " + "exp ="+exp);
        Assert.assertEquals(exp,res,0.01 );
    }

    @Test
    public void division() {
        double res = calculator.division(first,second);
        double exp = 4.12;
        System.out.println("res = "+res +" / " + "exp ="+exp);
        Assert.assertEquals(exp,res,0.01 );
    }

    @Test
    public void max() {
        double res = calculator.max(first,second);
        double exp = 10.3;
        System.out.println("res = "+res +" / " + "exp ="+exp);
        Assert.assertEquals(exp,res,0.01 );
    }

    @Test
    public void min() {
        double res = calculator.min(first,second);
        double exp = 2.5;
        System.out.println("res = "+res +" / " + "exp ="+exp);
        Assert.assertEquals(exp,res,0.01 );
    }

    @Test
    public void percent() {
        double res = calculator.percent(first,second);
        double exp = 24.2718;
        System.out.println("res = "+res +" / " + "exp ="+exp);
        Assert.assertEquals(exp,res,0.01 );
    }

    @Test
    public void degree() {
        double res = calculator.degree(first,second);
        double exp = 340.4811;
        System.out.println("res = "+res +" / " + "exp ="+exp);
        Assert.assertEquals(exp,res,0.01 );
    }
}