import java.util.*;
public class Coversion_p_k{
	public static void main(String[] args){
		System.out.println("Enter a number in pounds:");
		Scanner input = new Scanner(System.in);
		double pounds = input.nextDouble();
		System.out.println(pounds+" pounds is "+(pounds*0.454)+" kilograms");
	}
}
