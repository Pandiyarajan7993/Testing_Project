package seniumWebdriver;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day6Dataprovider extends Day6 {
	
	
	//DataProvider Execution
	
	@Test(dataProvider="dataprovider")
	public void dataTest(int Exp_Value,int a,int b) {
		Assert.assertEquals(addTest(a, b), Exp_Value);
		System.out.println("Addtion Validation");
		System.out.println("AV: "+addTest(a, b)+"EV: "+ Exp_Value);
		
	}
	
	@DataProvider(name="dataprovider")
	public Object[][] getData(){
		return new Object[][] {{10,5,5},{19,10,9},{21,14,7},{45,32,13},{25,19,6}};
	}
	
	//Normal Execution
	
	@Test()
	public void dataAdd() {
		addTest(6, 12);
		subTest(21, 10);
		mulTest(100, 2);
		divTest(125, 5);
	}
	//Ignore TestCase
	@Test(enabled=false)
	public void testIgnore() {
		System.out.println("Ignore TestCase");
	}

}
