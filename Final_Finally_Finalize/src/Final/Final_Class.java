package Final;

  class Test1 // here we use Final keyword its not Possiable
{
   void mNUmber()
   {
	   System.out.println("8465096921");
   }
    void atmPIN() 
	
   {
	   System.out.println("1998");
   }
}
class Thief1 extends Test1
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
public class Final_Class {
	

	public static void main(String[] args) {
		Thief1 t= new Thief1();
        t.mNumber();
        t.atmPIN();
	}

}
