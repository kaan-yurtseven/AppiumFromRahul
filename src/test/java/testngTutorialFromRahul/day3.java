package testngTutorialFromRahul;

import org.testng.annotations.*;

public class day3 {


    @Test (timeOut = 4000)// don't fail until time. this annotation is for timeOutsError.
    public void test(){
        System.out.println("time out");
    }

    @Parameters({"URL","username"})
    @Test
    public void parameter(String str,String str2){
        System.out.println(str);
        System.out.println(str2);
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

    @Test  (groups = {"Smoke"})
    public void webLoginCarLoan(){
        System.out.println("webLoginCarLoan");
    }

    @Test(enabled = false) // compiler will skip this step. If it is true it will execute.
    public void MobileLogincarLoan(){
        System.out.println("MobileLogincarLoan");
    }

    @Test  (groups = {"Smoke"})
    public void LoginAPIcarLoan(){
        System.out.println("LoginAPIcarLoan");
    }
    @Test (dependsOnMethods = {"LoginAPIcarLoan"})
    public void MobileSignincarLoan(){
        System.out.println("MobileSignincarLoan");
    }
    @Test(dependsOnMethods = {"MobileSignincarLoan"})
    public void MobileSignOutcarLoan(){
        System.out.println("MobileSignOutcarLoan");
    }

    @BeforeSuite
    public void bfSuit(){
        System.out.println("BeforeSuit in day 3");
    }
    @AfterSuite
    public void afSuit(){
        System.out.println("AfterSuit in day 3");
    }

    @BeforeMethod
    public void bfMethod(){
        System.out.println("BeforeMethod in day3");
    }

    @AfterMethod
    public void afMethod(){
        System.out.println("AfterMethod in day3");
    }

    @BeforeClass
    public void bfClass(){
        System.out.println("beforeClass in day3");
    }

    @AfterClass
    public void afClass(){
        System.out.println("afterClass in day3");
    }


}
