class Stock{
	String symbol = "";
	String name = "";
	double previousClosingPrice;
	double currentPrice;
	public Stock(String symbol,String name){
		this.symbol = symbol;
		this.name = name;
	}
	public double getChangePercent(){
		return (currentPrice-previousClosingPrice)/previousClosingPrice*100.0;
	}
}
public class Main{
	public static void main(String[] args){
		Stock oracle = new Stock("ORCL","Oracle Corporation");
		oracle.previousClosingPrice = 34.5;
		oracle.currentPrice = 34.35;
		System.out.printf("the price-change percentage is %f %%\n",oracle.getChangePercent());
	}
}
