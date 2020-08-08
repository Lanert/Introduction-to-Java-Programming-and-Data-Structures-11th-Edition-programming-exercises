import java.util.*;
public class C02E13{
	public static void main(String[] args){
		final float rate = 0.00417F;
		float principal = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthlysaving amount:");
		float monthlysaving = input.nextFloat();
		for(int i=1;i<=6;i++){
			principal+=monthlysaving;
			principal = principal*(1+rate);
		}
		System.out.println(principal);
		
	}
}
