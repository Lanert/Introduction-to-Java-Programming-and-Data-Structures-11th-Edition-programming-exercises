import java.util.*;
public class C02E11{
	public static void main(String[] args){
		final int people = 312032486;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of year:");
		int year = input.nextInt();
		int totalsecond = year*365*24*3600;
		int new_p = totalsecond/7;
		int dead_p = totalsecond/13;
		int immigration = totalsecond/45;
		System.out.println("The population in "+year+" years is "
		+(people+new_p-dead_p+immigration));
	}
}
