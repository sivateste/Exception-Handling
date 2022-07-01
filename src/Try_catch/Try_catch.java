package Try_catch;

public class Try_catch {

	public static void main(String[] args) {
		
		System.out.println("Exception Handling");
		
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(a/b);
			
		} catch (ArithmeticException e)  // Exception name, reason, line number ,method,class  
		{
			e.printStackTrace();
		}
		System.out.println("By siva");
	}

}
