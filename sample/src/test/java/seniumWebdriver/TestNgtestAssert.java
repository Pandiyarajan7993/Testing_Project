package seniumWebdriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgtestAssert extends TestNGtest1 {

		  @Test
		  public void TestCase1() {
			  Assert.assertEquals(testAdd(5, 5), 10);
			  System.out.println("Test1 Run Sucessfully");

		  }

		  @Test
		  public void TestCase2() {
			 Assert.assertNotEquals(testSub(10, 5), 7);
			  System.out.println("Test2 Run Sucessfully");
		}

		  @Test
		  public void TestCase3() {
			  Assert.assertNotNull(testAdd(5, 5), "Not Null");
			  System.out.println("Test3 Run Sucessfully");
		    
		  }
		  @Test
		  public void TestCase4() {
			  Assert.assertNull(testNull(), "Null String");
			  System.out.println("Test4 Run Sucessfully");
		    
		  }@Test
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



