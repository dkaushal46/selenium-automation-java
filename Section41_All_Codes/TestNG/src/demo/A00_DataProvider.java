package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A00_DataProvider {

	@Test(dataProvider="getdata")
	public void PrintAll(String Username,String Password) {
		
		System.out.println(Username);
		System.out.println(Password);
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
