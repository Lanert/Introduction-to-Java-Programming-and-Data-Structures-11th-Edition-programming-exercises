import java.util.*;
public class Energy{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of water in kilograms:");
		float amount = input.nextFloat();
		System.out.println("Enter the initial temperature:");
		float i_tmp = input.nextFloat();
		System.out.println("Enter the final temperature:");
		float f_tmp = input.nextFloat();
		System.out.println("The energy needed is "+(f_tmp-i_tmp)*amount*4184);
	}
}
