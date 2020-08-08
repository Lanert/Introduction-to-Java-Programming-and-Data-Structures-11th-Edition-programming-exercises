import java.util.Scanner;
public class Equation {
	public static void main(String[] args){
		System.out.println("Enter a, b, c, d, e, f:");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
	        double e = input.nextDouble();
		double f = input.nextDouble();
		if(a*d-b*c==0)
			System.out.println("The equation has no solution");
		else{
			double x = (e*d-b*f)/(a*d-b*c);
			double y = (a*f-e*c)/(a*d-b*c);
			System.out.printf("x is %f ,y is %f",x,y);};
	}
}
