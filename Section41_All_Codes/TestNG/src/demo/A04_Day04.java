package demo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A04_Day04 {
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String WebloginHomeLoanURL) {
		System.out.println("WebloginHomeLoan");
		System.out.println(WebloginHomeLoanURL);
	}
	
	@Test
	public void MobileloginHomeLoan() {
		System.out.println("MobileloginHomeLoan");
	}

	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHomeLoan");
	}	
}
