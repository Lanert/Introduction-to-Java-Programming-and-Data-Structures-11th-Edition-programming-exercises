import java.util.Scanner;
public class Isbn{
	public static void main(String[] args){
		int i,sum = 0;
		int[] ISBN = new int[9];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		String isbn = input.nextLine();
		System.out.print("The ISBN-10 number is ");
		for(i = 0;i < isbn.length();i++){
			ISBN[i] = Integer.parseInt(String.valueOf(isbn.charAt(i)));
			//isbn.charAt(i)make the "i" place of string became char,the cher to string,string to int
			sum +=ISBN[i] * (i+1);
			System.out.print(ISBN[i]);
		}
		if(sum%11==10)
			System.out.print("X");
		else
			System.out.print(sum%11);	
	}
}
