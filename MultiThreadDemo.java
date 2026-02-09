import java.util.Random; 
class Square extends Thread
{
	int x;
	Square(int x) //constructor
	{
	 this.x = x;
	}
	public void run()
	{
		int sqr = x * x;
		System.out.println("Square of " + x + " = " + sqr );
	}
}
class Cube extends Thread
	{
	int x; 
	Cube(int x) //constructor
	{
		this.x = x;
	}
	public void run()
	{
		int cub = x * x * x;
		System.out.println("Cube of " + x + " = " + cub );
	}
}
class Number extends Thread
{
		public void run()
		{
		 Random random = new Random(); 
		for(int i =0; i<5; i++)
		{
		      int randomInteger = random.nextInt(20);
		
		System.out.println("Random Integer generated : " + randomInteger); 
		Square s = new Square(randomInteger);
		s.start(); //to call  square class run method
		Cube c = new Cube(randomInteger); 
		c.start(); //to call cube run method
		try {
		Thread.sleep(1000);
		/*This thread generates random number 10 times between 1 to 100 for every 1 second. The generated random number is then passed as argument to Square and Cube threads.
		Output varies each time a program is executed.*/
		} catch (InterruptedException ex) 
		{
			System.out.println(ex);
		}
}
}
}
public class MultiThreadDemo{ 
	public static void main(String args[])
	{
		Number n = new Number();  //First Thread  
		n.start();
	}
}

