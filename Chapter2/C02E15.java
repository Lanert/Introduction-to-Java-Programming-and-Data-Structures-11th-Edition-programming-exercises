import java.util.*;
public class C02E15{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 and x2:");
		float x1 = input.nextFloat();
		float x2 = input.nextFloat();
		System.out.println("Enter y1 and y2:");
		float y1 = input.nextFloat();
		float y2 = input.nextFloat();
		System.out.println("The distance between the two points is"+
		Math.pow((x1-y1)*(x1-y1)+(x2-y2)*(x2-y2),0.5));
	}
}
