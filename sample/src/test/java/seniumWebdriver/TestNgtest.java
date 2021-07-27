package seniumWebdriver;



public class TestNgtest {

	public  int testAdd(int a,int b) {
		return a+b;
		
	}
	public int testSub(int a,int b) {
		return a-b;
		

	}
	
	public int testMul(int a,int b) {
		return a*b;
		
	}
	public int testDiv(int a,int b) {
		return a/b;
		
	}
	
	public String  testNull() {

		return null;
	}
	
	public boolean testTrue()
	{
		if ( 1==1) {
			return true;	
		}
		return false;
		
		
	}
	
	public boolean testFalse()
	{
		if ( 1==0) {
			return true;	
		}
		return false;
		
		
	}
	
}
