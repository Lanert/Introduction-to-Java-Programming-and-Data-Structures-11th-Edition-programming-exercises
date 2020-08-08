import java.util.*;
public class Triangle{
	public static void main(String[] args){
		double s1,s2,s3;
		Scanner input = new Scanner(System.in);
		do{System.out.println("Enter three point like\nx1 y1 x2 y2 x3 y3:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		s1 = Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5);
		s2 = Math.pow((x3-x2)*(x3-x2)+(y2-y3)*(y2-y3),0.5);
		s3 = Math.pow((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1),0.5);
		}while(s1>s2+s3||s2>s1+s3||s3>s1+s2);
		double s = (s1+s2+s3)/2;
		double area = Math.pow(s*(s-s1)*(s-s2)*(s-s3),0.5);
		System.out.println("The area of triangle is "+area);
	}
}
