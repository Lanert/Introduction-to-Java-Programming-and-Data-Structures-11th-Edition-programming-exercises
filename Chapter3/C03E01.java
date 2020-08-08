import java.util.Scanner;
public class C03E01 {
	public static void main(String[] args){
		System.out.println("Enter a, b, c:");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double e = Math.sqrt(b*b-4*a*c);
		if(e>0)
			System.out.println("The equation has two roots "
			+((-b+e)/2/a)+" and "+((-b-e)/2/a));
		else if(e==0)
			System.out.println("The equation has one root "+(-b/2/a));
		else 
			System.out.println("The equation has no root ");
	}
}
