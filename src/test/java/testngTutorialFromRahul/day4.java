package testngTutorialFromRahul;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.class)
public class day4{

    @Test(groups = {"Smoke"})
    public void webLoginCarLoan(){
        System.out.println("webLoginCarLoan4");
    }

    @Test
    public void MobileLogincarLoan(){
        System.out.println("MobileLogincarLoan4");
    }

    @Test
    public void LoginAPIcarLoan(){
        System.out.println("LoginAPIcarLoan4");
    }
    @Test
    public void test(){
        System.out.println("LoginAPIcarLoan4");
        Assert.assertTrue(false);
    }

    @DataProvider
    public Object[][] getData(){
        //1st combination -username-password -good credit history
        //2nd- usernmae password - no credit history
        //3st- fraudelent credit history
        Object[][] data = new Object[3][2];
        data[0][0] = "firstsetusername";
        data[0][1] = "password";
        //columns in the row are nothing but values for tht particular combination(row)
        data[1][0] = "secondsetusername";
        data[1][1]  = "secondPAssword";

        data[2][0] = "thirdsetusernmae";
        data[2][1] = "thirdPassword";


        return data;
    }
    @Test  (dataProvider = "getData")
    public void parameter2(String username,String password){

        System.out.println(username+" "+password);
    }
}
