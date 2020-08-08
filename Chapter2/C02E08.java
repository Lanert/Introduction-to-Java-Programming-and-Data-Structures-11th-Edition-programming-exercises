package Chapter2;

import java.util.*;
public class C02E08{
	public static void main(String[] args){
		System.out.println("Enter the time zone offset to GMT:");
		Scanner input = new Scanner(System.in);
		int gmt = input.nextInt();
		long totalseconds = (System.currentTimeMillis())/1000;
		long currentsecond = totalseconds%60;
		long currentminute = totalseconds/60%60;
		long currenthour = totalseconds/3600%24;
		System.out.println("The current time is "+(currenthour+gmt)+
		":"+currentminute+":"+currentsecond);
	}
}
