package testngTutorialFromRahul;

import org.testng.Assert;
import org.testng.annotations.*;

public class day1 {

    @Test  (groups = {"Smoke"})
    public void Demo(){
        System.out.println("hello");//you can run it without main method like this.
    }

    @Test
    public void SecondTest(){
        System.out.println("bye");
    }
    @BeforeTest
    public void prerequest(){
        System.out.println("beforeTest in day1");
    }
    @AfterTest
    public void  last(){
        System.out.println("afterTest in day1");
    }

    @Test
    public void test(){
        System.out.println("LoginAPIcarLoan4");
        Assert.assertTrue(false);
    }

}
