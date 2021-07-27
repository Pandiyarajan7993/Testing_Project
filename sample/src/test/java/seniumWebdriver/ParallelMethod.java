package seniumWebdriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelMethod {
	@Parameters({"Browser"})
	@Test
	public void ParallelA(String S) {
		if (S.equals("Chrome")) {
			
		
		System.out.println("FirstMethod");
		}
		}
	@Parameters({"Browser"})
	@Test
	public void ParallelB(String S) {
		if (S.equals("IDE")) {
			
			
			System.out.println("SecondMethod");
			}	}
	@Parameters({"Browser"})
	@Test
	public void ParallelC(String S) {
		if (S.equals("Opera")) {
			
			
			System.out.println("ThirdMethod");
			}	}
	@Parameters({"Browser"})
	@Test
	public void ParallelD(String S) {
		if (S.equals("UC")) {
			
			
			System.out.println("ForuthMethod");
			}}
	@Parameters({"Browser"})
	@Test
	public void ParallelE(String S) {
		if (S.equals("Safe")) {
			
			
			System.out.println("FiveMethod");
			}}
	@Parameters({"Browser"})
	@Test
	public void ParallelF(String S) {
		if (S.equals("Edge")) {
			
			
			System.out.println("SixthMethod");
			}}

}
