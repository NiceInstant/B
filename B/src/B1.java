
public class B1 {

	public static void main(String[] args) {
		
System.out.print(fib(30));
	}

	private static int fib (int i)  {
		while (fib(i)<4000000) {
		if(i==0) {
			return 0;
		  } 
		if(i==1) {
			return 1;			
		}
		else return fib(i-2)+fib(i-1);
	   }
		return i;
	}
}
