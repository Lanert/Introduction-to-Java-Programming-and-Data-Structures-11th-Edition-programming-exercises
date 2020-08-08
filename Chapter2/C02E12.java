import java.util.*;
public class Runway{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed and acceleration:");
		float speed = input.nextFloat();
		float acceleration = input.nextFloat();
		System.out.println("The minimum runway length of this airplane is "+
		(speed*speed/2/acceleration));
	}
}
