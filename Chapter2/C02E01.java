import java.util.*;
public class C02E01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius:");
		double c_t = input.nextDouble();
		double f_t = (9.0/5)*c_t+32;
		System.out.println(c_t+" Celsius is "+f_t+"Fahrenheit");
	}
}
