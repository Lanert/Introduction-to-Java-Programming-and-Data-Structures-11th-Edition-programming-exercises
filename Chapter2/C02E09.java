import java.util.*;
public class Avg{
	public static void main(String[] args){
		System.out.println("Enter v0, v1 and t:");
		Scanner input = new Scanner(System.in);
		float v0 = input.nextFloat();
		float v1 = input.nextFloat();
		float t = input.nextFloat();
		System.out.println("The average acceleration is "+(v1-v0)/t);
	}
}
