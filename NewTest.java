package example;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test(dataProvider = "testData")
	public void f(String username, int value)
	{
		Reporter.log(username);
		Reporter.log(Integer.toString(value));
	}
	@DataProvider
	public Object[][] testData(){
		Object[][] obj = new Object[3][2];
		obj[0][0] = "admin";
		obj[0][1] = 123;
		obj[1][0] = "user";
		obj[1][1] = 456;
		obj[2][0] = "qa";
		obj[2][1] = 789;
		return obj;
	}
}
