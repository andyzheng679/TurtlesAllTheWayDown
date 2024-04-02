import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void factorialTest(){
        int expected = 24;
        int actual = Factorial.factorial(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest1(){
        int expected = 3628800;
        int actual = Factorial.factorial(10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTestLoop(){
        int expected = 24;
        int actual = Factorial.factorialLoop(4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTestLoop1(){
        int expected = 3628800;
        int actual = Factorial.factorialLoop(10);

        Assert.assertEquals(expected, actual);
    }
}
