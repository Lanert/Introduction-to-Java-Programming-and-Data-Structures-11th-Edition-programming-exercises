import java.util.*;
public class C03E09{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean yn = false;
        int num1 = (int)(Math.random()*100);
        int num2 = (int)(Math.random()*100);
        if(num2>num1){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("what is "+num1+"-"+num2+"?");
        int answer = input.nextInt();
        if(answer==num1-num2)
            yn = true;
        System.out.println(yn);
    }
}
