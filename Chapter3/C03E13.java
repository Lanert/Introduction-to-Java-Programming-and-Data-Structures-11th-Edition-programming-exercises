import java.util.*;
public class C03E13{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		System.out.println("plase input guess,front is 1,back is 0");
        int guess = input.nextInt();
		int radnum = (int)(Math.floor(Math.random()+0.5));
		if(radnum==guess)
			System.out.println("you are right");
		else
			System.out.println("sorry, you are wrong");
    }
}
