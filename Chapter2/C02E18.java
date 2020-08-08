public class Printform{
	public static void main(String[] args){
		System.out.println("a    b    pow(a,b)");
		for(int i=1;i<=5;i++){
			System.out.printf("%-4d %-4d %d\n",i,(i+1),(int)Math.pow(i,i+1));
		}
	}
}
