import java.util.Scanner;
public class C03E07 {
	public static void main(String[] args){
		final int num = 5;
		int i,j;
		Scanner input = new Scanner(System.in);
		System.out.print("place input three numbers: ");
		double[] n = new double[num];
		for(i = 0;i < num;i++)
			n[i] = input.nextDouble();
		for(i = 0;i < num-1;i++){
			for(j = i+1;j < num;j++){
				if(n[i]>=n[j]){
					double k = n[i];
					n[i] = n[j];
					n[j] = k;	
				}		
			}
			System.out.print(n[i]+" ");
		}
		System.out.print(n[num-1]+" ");
	}
}
