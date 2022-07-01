package Final;

class Test
{
   void mNUmber()
   {
	   System.out.println("8465096921");
   }
     void atmPIN()  // here we use Final keyword its not Possiable
	
   {
	   System.out.println("1997");
   }
}
class Thief extends Test
{
   void mNumber()
   {
	   System.out.println("8465096921");
   }
   void atmPIN()
   {
	   System.out.println("1997");
   }
}

public class Final_method {

	public static void main(String[] args) {
       
		Thief t= new Thief();
	          t.mNumber();
	          t.atmPIN();
	}

}
