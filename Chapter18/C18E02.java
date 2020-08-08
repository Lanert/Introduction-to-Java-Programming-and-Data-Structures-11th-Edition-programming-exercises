import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		System.out.print("ENTER A NUMBER");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("第"+n+"位斐波那契数是"+fib(n));
    }
	public static int fib(int n){
		int fib0 = 0,fib1 = 1,currentfib=0;
		for(int i = 0;i<n;i++){
			currentfib = fib0+fib1;
			fib0 = fib1;
			fib1 = currentfib;
		}
		return fib0;
	}
}
