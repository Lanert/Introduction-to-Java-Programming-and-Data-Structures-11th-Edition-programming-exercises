import java.util.*;
public class Text{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		System.out.print("plase input a number");
        int num = Math.abs(input.nextInt());
		String txt = ""+num;
		if(ispalindrome(txt))
			System.out.println(num+" is a palindrome");
        else 
			System.out.println(num+" is not a palindrome");
    }
	public static boolean ispalindrome(String txt){
		return ispalindrome(txt,0,txt.length()-1);
	}
	private static boolean ispalindrome(String txt,int low,int high){
		if(low>=high)
			return true;
		else if(txt.charAt(low)!=txt.charAt(high))
			return false;
		else
			return ispalindrome(txt,low+1,high-1);
	}
}
