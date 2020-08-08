import java.util.*;
public class Hexagon{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the side:");
		float side = input.nextFloat();
		System.out.println("The area of hexagon is "+
		Math.pow(3,0.5)*1.5*side*side);
	}
}
