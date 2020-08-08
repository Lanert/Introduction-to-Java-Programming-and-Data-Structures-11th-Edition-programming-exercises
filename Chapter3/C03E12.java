import java.util.*;
public class C03E12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		System.out.print("plase input a number");
        double income = input.nextDouble();
		System.out.println(tax(income));
    }
	public static double tax(double income){
		if(income<=16700)
			return income*0.1;
		else if(income<=67900)
			return (income-16700)*0.15+tax(16700);
		else if(income<=137050)
			return (income-67900)*0.25+tax(67900);
		else if(income<=208850)
			return (income-137050)*0.28+tax(137050);
		else if(income<=372950)
			return (income-208850)*0.33+tax(208850);
		else 
			return (income-372950)*0.35+tax(372950);
	}
}
//主程序未添加，请自行添加
