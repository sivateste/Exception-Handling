package Finally;

public class Try_catch_Finally {

	public static void main(String[] args) {

		try {
			String s="siva";
			int a=10,b=0,c;
			c=a+b;
			
			System.out.println(s);
			System.out.println(c);
			System.out.println("All ok go...");
		} catch (Exception e) {

		 System.out.println("can't divied by zero");
		}
		finally
		{
			System.out.println("Succsfuly completed");
		}
		System.out.println("End the Code");
	}

}
