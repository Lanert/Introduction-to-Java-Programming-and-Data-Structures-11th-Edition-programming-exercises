import java.util.*;
public class C02E21{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment:");
		float investment = input.nextFloat();
		System.out.println("Enter annual interest rate oin percentage:");
		float rate = input.nextFloat();
		System.out.println("Enter number of year");
		float year = input.nextFloat();
		float value = investment*(float)Math.pow((1+0.01*rate/12),12);
		System.out.println("Future value is "+value);
	}
}
