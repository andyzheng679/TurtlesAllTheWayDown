import org.junit.Assert;
import org.junit.Test;

public class GCDTest {

    @Test
    public void GCDTest(){
        int expected = 24;
        int actual = GCD.gcd(1440, 408);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GCDTestLoop(){
        int expected = 24;
        int actual = GCD.gcdLoop(1440, 408);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GCDTimingTest(){
        long gcdTime = GCD.gcdTime(1440, 408);
        long gcdLoopTime = GCD.gcdLoopTime(1440, 408);

        Assert.assertTrue(gcdLoopTime < gcdTime);

    }
}
