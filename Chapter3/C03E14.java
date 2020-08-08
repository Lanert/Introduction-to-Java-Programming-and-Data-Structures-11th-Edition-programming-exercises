import java.util.*;
public class C03E14 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit number:");
		int think_num = input.nextInt();
		int winning_num = (int)(Math.random()*1000+1);
		int t1 = think_num/100,t2 = think_num%100/10,t3 = think_num%10;
		int w1 = winning_num/100,w2 = winning_num%100/10,w3 = winning_num%10;
		System.out.printf("You think num is %d,winning num is %d.\n",think_num,winning_num);
		if(think_num==winning_num){
			System.out.println("You won $ 10000");
		}else if((t1==w1)&&(t3==w2)&&(t2==w3)||
			(t2==w1)&&(t1==w2)&&(t3==w3)||
			(t2==w1)&&(t3==w2)&&(t1==w3)||
			(t3==w1)&&(t1==w2)&&(t2==w3)||
			(t3==w1)&&(t2==w2)&&(t1==w3)){
			System.out.println("You won $ 3000");
		}else if((t1==w1)||(t1==w2)||(t1==w3)||
			(t2==w1)||(t2==w2)||(t2==w3)||
			(t3==w1)||(t3==w2)||(t3==w3)){
			System.out.println("You won $ 1000");
		}else{
			System.out.println("You won $ 0!");
		}
	}
}
