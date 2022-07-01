package Try_catch;

public class Try_catchs {

	public static void main(String[] args) {

		try {
			int arr[]= {2,6};
			    arr[1]=17;
			   arr[3]=3/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}
	}

}
