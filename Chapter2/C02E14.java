import java.util.*;
public class Bmi{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds:");
		float weight = input.nextFloat();
		System.out.println("Enter height in inches:");
		float height = input.nextFloat();
		System.out.println("BMI is "+
		(weight*0.45359237)/Math.pow((height*0.0254),2));
	}
}
