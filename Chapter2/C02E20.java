import java.util.*;
public class C02E20{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment and rate:");
		float investment = input.nextFloat();
		float rate = input.nextFloat();
		float value = investment*(rate/1200);
		System.out.println("Future value is "+value);
	}
}
