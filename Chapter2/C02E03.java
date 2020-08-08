import java.util.*;
public class Coversion_f_m{
	public static void main(String[] args){
		System.out.println("Enter a value for feet:");
		Scanner input = new Scanner(System.in);
		double feet = input.nextDouble();
		System.out.println(feet+" feet is "+(feet*0.305)+" meters");
	}
}
