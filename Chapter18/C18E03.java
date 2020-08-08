import java.util.Scanner;
public class C18E03{
	public static void main(String[] args) {
		System.out.print("ENTER TWO NUMBER");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		System.out.println(gcd(m,n));
    }
	public static int gcd(int m,int n){
		if(n>m){
			int k=n;n=m;m=k;
		}
		if(m%n==0)
			return n;
		else
			return gcd(n,m%n);
	}
}
