import java.util.*;
public class C02E07{
	public static void main(String[] args){
		System.out.println("Enter the number of minutes:");
		Scanner input = new Scanner(System.in);
		int totalmiunte = input.nextInt();
		int currenday = totalmiunte/1440%365;
		int totalyear = totalmiunte/1440/365;
		System.out.println(totalmiunte +" minutes is approximately "+
		totalyear +" years and "+currenday+" days");
	}
}
