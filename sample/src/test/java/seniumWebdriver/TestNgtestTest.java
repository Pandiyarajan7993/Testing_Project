package seniumWebdriver;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgtestTest extends TestNgtest {

	@BeforeMethod
	public void beforeMethod() {
		Date date=new Date();
		System.out.println("Before Method");
		System.out.println(date);

		}
	@AfterMethod
	public void afterMethod() {
		Date date=new Date();
		System.out.println("After Method");
		System.out.println(date);

			}
	@BeforeClass
	public void beforeClass() {
		Date date=new Date();
		System.out.println("Bofore Class");
		System.out.println(date);

		
	}

	@AfterClass
	public void afterClass() {
		Date date=new Date();
		
		System.out.println("After Class");
		System.out.println(date);
}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Before Test");
		Date date=new Date();
		System.out.println(date);
		
	}
	@AfterTest
	public void afterTest() {
		Date date=new Date();
		System.out.println("After Test");
		System.out.println(date);
	}
	
	@BeforeSuite
	public void beforeSuite() {
		Date date=new Date();
		System.out.println("Before Suite");
		System.out.println(date);
		
	}
	@AfterSuite
	public void afterSuite() {
		Date date=new Date();
		System.out.println("After Suite");
		System.out.println(date);

	}
		
  @Test(dependsOnMethods="TestCase5")
  public void TestCase1() {
	  Assert.assertEquals(testAdd(5, 5), 10);
	  System.out.println("Test1 Run Sucessfully");

  }

  @Test(dependsOnMethods="TestCase3")
  public void TestCase2() {
	 Assert.assertNotEquals(testSub(10, 5), 7);
	  System.out.println("Test2 Run Sucessfully");
	  
}

  @Test()
  public void TestCase3() {
	  Assert.assertNotNull(testAdd(5, 5), "Not Null");
	  System.out.println("Test3 Run Sucessfully");
    
  }
  @Test(priority=1)
  public void TestCase4() {
	  Assert.assertNull(testNull(), "Null String");
	  System.out.println("Test4 Run Sucessfully");
    
  }@Test(priority=2)
  public void TestCase5() {
	  Assert.assertSame(testAdd(5, 5), testSub(15, 5), "Assert Same");
	  System.out.println("Test5 Run Sucessfully");
    
  }@Test
  public void TestCase6() {
	  Assert.assertNotSame(testMul(5, 5), testDiv(125, 3));
	  System.out.println("Test6 Run Sucessfully");
    
  }
  @Test
  public void TestCase7() {
	  Assert.assertFalse(testFalse(), "Assert False");
	  
	  System.out.println("Test7 Run Sucessfully");
    
  }
  @Test
  public void TestCas8() {
	  Assert.assertTrue(testTrue(),"Assert True");
	  System.out.println("Test8 Run Sucessfully");
    
  }
}
