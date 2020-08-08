import java.util.*;
public class Wind{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
		float temperature = input.nextFloat();
		System.out.println("Enter the wind speed(>=2) in miles per hour:");
		float speed = input.nextFloat();
		double v = Math.pow(speed,0.16);
		System.out.println("The wind chill index is "+
		(float)(35.74+0.6215*temperature-35.75*v+0.4275*temperature*v));
	}
}
