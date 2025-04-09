import org.cicd.Caculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {

    @Test
    public void testSum(){
        Caculator calCaculator = new Caculator();
        Assert.assertEquals(calCaculator.sum(2,3), 5);
        System.out.println("Success");
    }

    @Test
    public void testSub(){
        Caculator calCaculator = new Caculator();
        Assert.assertEquals(calCaculator.sub(2,2), 0);
    }
}
