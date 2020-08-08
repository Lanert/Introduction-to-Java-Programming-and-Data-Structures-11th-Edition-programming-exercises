import java.util.Scanner;
public class C18E06{
	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++)
			System.out.println(series(i));
    }
	public static double series(int i){
		return series(i,0);
	}
	private static double series(int i,double result){
		if(i==0)
			return result;
		else
			return series(i-1,result+((double)i/(i+1)));
	}
}
