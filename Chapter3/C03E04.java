import java.util.Scanner;
public class Month {
	public static void main(String[] args){
		int num = (int)(Math.random()*12+1);
		String month = "";
		switch(num){
			case 1 : month = "Jaunary";break;
			case 2 : month = "February";break;
			case 3 : month = "March";break;
			case 4 : month = "April";break;
			case 5 : month = "May";break;
			case 6 : month = "June";break;
			case 7 : month = "July";break;
			case 8 : month = "Augest";break;
			case 9 : month = "september";break;
			case 10 : month = "October";break;
			case 11 : month = "November";break;
			case 12 : month = "December";break;
		}
		System.out.println(num+month);
		}
}
