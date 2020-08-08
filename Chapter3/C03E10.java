import java.util.*;
public class Text{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		int day = 28;String month = "";
		System.out.print("plase input year and month");
        int year = input.nextInt();
		int month_num = input.nextInt();
        switch(month_num){
			case 1 : month = "Jaunary";day = 31;break;
			case 2 : month = "February";
				if(isleap(year))
					day = 29;break;
			case 3 : month = "March";day = 31;break;
			case 4 : month = "April";day = 30;break;
			case 5 : month = "May";day = 31;break;
			case 6 : month = "June";day = 30;break;
			case 7 : month = "July";day = 31;break;
			case 8 : month = "Augest";day = 31;break;
			case 9 : month = "september";day = 30;break;
			case 10 : month = "October";day = 31;break;
			case 11 : month = "November";day = 30;break;
			case 12 : month = "December";day = 31;break;
		}
        System.out.println(month+" "+year+" has "+day+" days.");
    }
	public static boolean isleap(int year){
		if((year%4==0&&year%100!=0)||year%400==0)
			return true;
		return false;
	}
}
