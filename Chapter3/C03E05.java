import java.util.Scanner;
class Week{
	public static String returnday(int date){
		String day = "";
		switch(date%7){
			case 1 : day = "Monday";break;
			case 2 : day = "Tuesday";break;
			case 3 : day = "Wednesday";break;
			case 4 : day = "Thursday";break;
			case 5 : day = "Friday";break;
			case 6 : day = "Saturday";break;
			case 0 : day = "Sunday";break;
		}
		return day;
	}
}
public class C03E05 {
	public static void main(String[] args){
		System.out.print("Enter today's day: ");
		Scanner input = new Scanner(System.in);
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int add = input.nextInt();
		System.out.print("today is "+Week.returnday(today)+
		" and the future day is "+Week.returnday(today+add));
	}
}
