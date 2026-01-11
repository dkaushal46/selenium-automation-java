package demo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class A03_Day03 {
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("(((BeforeClass))) will run before the class is executed");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("(((AfterClass))) will run before the class is executed");
	}
	
	
	@Parameters({"URL","APIKey/UserName"}) //XML to Url then url to urlLinkSaveHere
	@Test(groups= {"Smoke"})
	public void WebloginCarLoan(String urlLinkSaveHere,String Key) {
		System.out.println("WebloginCarLoan");
		System.out.println(urlLinkSaveHere);
		System.out.println(Key);
	} 
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("(((Before Method))) will execute before every test method day3 class if mobile is not before their method name");
	}	
	
	@Test(enabled =true) //if there is a but we can disable it using false statement
	public void MobileloginCarLoan() {
		System.out.println("MobileloginCarLoan");
	}
	
	@BeforeSuite
	public void BFSuit() {
		System.out.println("(((Before suite))) execute on topp");
	}
	
	
	/*@Test(timeOut=4000)
	public void MobilelogOutCarLoan() {
		System.out.println("MobilelogoutCarLoan");
	}*/
	
	@Test(dataProvider="getdata")
	public void MobilelogOutCarLoan(String Username,String Password) {
		System.out.println("MobilelogoutCarLoan");
		System.out.println(Username);
		System.out.println(Password);
	}

	@Test(dependsOnMethods= {"MobilelogOutCarLoan","MobileloginCarLoan"})    //it will run MobilelogOutCarLoan before LoginAPICarLoan
	public void LoginAPICarLoan() {        
		System.out.println("LoginAPICarLoan");
	}	
	
	@DataProvider
	public Object[][] getdata() {
		//1.Username password - good credit history
		//2.Username password - no Credit History
		//3.Username password - Fraud History
		
		Object[][] data =new Object[3][2]; //2D Array for saving id in 1 and password in 2nd
		//[3] represent rows
		//[2] represent columns
		
		//1st Set
		data[0][0]="FirstUserName";
		data[0][1]="FirstUser-Password";
		
		//1st Set
		data[1][0]="SecondUserName";
		data[1][1]="SecondUser-Password";
	
		//1st Set
		data[2][0]="ThirdUserName";
		data[2][1]="ThirdUser-Password";
		
		return data;
	}
}
