import java.math.*;
import java.util.Scanner;
public class C18E01 {
	public static void main(String[] args) {
		System.out.print("ENTER A NUMBER");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(n+"! is "+factorial(n));
    }
	public static BigInteger factorial(int n){
		return factorial(new BigInteger(String.valueOf(n)),new BigInteger("1"));
	}
	private static BigInteger factorial(BigInteger n,BigInteger result){
		if(n.equals(BigInteger.ZERO))
			return result;
		else
			return factorial(n.subtract(new BigInteger("1")),n.multiply(result));
	}
}
