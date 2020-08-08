import java.util.*;
public class C02E02{
	public static void main(String[] args){
		final double PI = 3.1415926;
		System.out.println("Enter the radius and length of a cylinder");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = PI*radius*radius;
		System.out.println("The area is "+(int)(area*100)/100.0);
		System.out.println("The volume is "+(int)(area*length*100)/100.0);
	}
}
