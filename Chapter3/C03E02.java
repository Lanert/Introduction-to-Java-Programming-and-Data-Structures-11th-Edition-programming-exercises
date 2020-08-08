import java.util.Scanner;
public class C03E02 {
	public static void main(String[] args){
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		int num3 = (int)(Math.random()*10);
		System.out.println("What is "+num1+" + "+num2+" + "+num3);
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		System.out.println(num1+" + "+num2+" + "+num3+" = "+
		answer+" is "+(answer==num1+num2+num3));
	}
}
