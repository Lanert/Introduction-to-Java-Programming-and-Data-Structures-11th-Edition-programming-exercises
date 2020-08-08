import java.util.*;
public class Bmi{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds:");
		float weight = input.nextFloat();
		System.out.print("Enter feet:");
		float feet = input.nextFloat();
		System.out.print("Enter inches:");
		float inches = input.nextFloat();
		double bmi = (weight*0.45359237)/Math.pow((inches*0.0254+feet*0.3048),2);
		System.out.println("BMI is "+bmi);
		if(bmi>=30)
			System.out.println("Obese");
		else if(bmi>=25)
			System.out.println("Overweight");
		else if(bmi>=18.5)
			System.out.println("Normal");
		else
			System.out.println("Underweight");
	}
}
