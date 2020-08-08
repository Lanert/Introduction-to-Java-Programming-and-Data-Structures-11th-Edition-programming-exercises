import java.util.*;
public class Drive{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter driving distance:");
		float distance = input.nextFloat();
		System.out.println("Enter miles par gallen:");
		float gallen = input.nextFloat();
		System.out.println("Enter price per gallen");
		float price = input.nextFloat();
		System.out.println("The cost of driving is "+distance/gallen*price);
	}
}
