import java.util.*;
public class C02E06{
	public static void main(String[] args){
		while(true){System.out.println("Enter a number between 0 and 1000");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int kw = num/1000;
		int bw = num%1000/100;
		int sw = num%100/10;
		int gw = num%10;
		System.out.println("The sum of the digits is "+(kw+bw+gw+sw));}
	}
}
