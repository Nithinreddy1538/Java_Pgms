import java.util.Scanner;
public class bikerace{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		int racer=5;
		double speed[]=new double[5];
		double sum=0.0;
		System.out.println("enter the speed of"+racer+"bikers");
		for(int i=0;i<racer;i++){
			System.out.println("biker"+(i+1)+"speed:");
			speed[i]=scanner.nextDouble();
			sum+=speed[i];
		}
		double averageSpeed=sum/racer;
		System.out.println("\nAverage Speed:"+averageSpeed);
		System.out.println("bickers who qualify");
		for(int i=0;i<racer;i++){
			if(speed[i]>averageSpeed){
				System.out.println("bikers"+(i+1)+"with speed:"+speed[i]);
				
			}
		}
		scanner.close();
	}
}
