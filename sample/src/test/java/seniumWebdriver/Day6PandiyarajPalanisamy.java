package seniumWebdriver;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Day6PandiyarajPalanisamy extends Day6 {
	
	@Test
	public void test1() {
		System.out.println(addTest(10, 12));
		System.out.println("TestCase1 ");
	}
	@Test
	public void test2() {
		System.out.println(subTest(50, 23));
		System.out.println("TestCase2");
	}
	@Test
	public void test3() {
		System.out.println(mulTest(4, 12));
		System.out.println("TestCase3");
	}
	@Test
	public void test4() {
		System.out.println(divTest(10, 2));
		System.out.println("TestCase4");
	}

	@Test
	public void test5() {
		System.out.println(mulTest(10, 2));
		System.out.println("TestCase4");
	}
	@Test
	public void test6() {
		System.out.println(addTest(10, 2));
		System.out.println("TestCase4");
		Reporter.log("All Test Case will Pass",true);
	}

}
