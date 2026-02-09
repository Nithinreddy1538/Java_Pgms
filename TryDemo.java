 public class TryDemo {

	public static void main(String[] args) {
		
	int x=10;
	String s=null;
	int array[]=new int[5];
	try {
	System.out.println(x/0); 
	System.out.println(s.length()); 
	System.out.println(array[6]); 
	}
	catch(ArithmeticException Ae)
	{
		Ae.printStackTrace();
	}
	catch(NullPointerException Npe)
	{
		System.out.println(Npe);
	}
	catch(ArrayIndexOutOfBoundsException Aioobe)
	{
		System.out.println(Aioobe);
	}
	catch(Exception e)
	{
		System.out.println("Other Exception");
	}
	finally {
		System.out.println("Clean Up Code/Shutdown Code/Closing connections");
	}
    

}
 }