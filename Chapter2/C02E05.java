import java.util.*;
public class C02E05{
	public static void main(String[] args){
		System.out.println("Enter the subtotal and a gratuity rate");
		Scanner input = new Scanner(System.in);
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		double fee = (rate*subtotal)/100;
		System.out.println("The gratuity is $"+fee+
		" and total is $"+(fee+subtotal));
	}
}
