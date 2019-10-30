
import org.junit.Assert; //this is for the class firstTest to see the needed libs because it does not have a pom.xml file
import org.junit.Test;

public class firstTest
{
    @Test       // first class addition method
    public void firstClassAdditionMethod()
    {
        Assert.assertEquals(10,first.addition(5,5));
    }

    @Test       // first class multiplication method
    public void firstClassMultiMethod()
    {
        Assert.assertEquals(10, first.multiplication(5,2));

    }


}
