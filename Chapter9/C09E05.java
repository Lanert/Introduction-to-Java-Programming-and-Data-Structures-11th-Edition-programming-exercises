import java.util.GregorianCalendar;
public class C09E05 {
	public static void main(String[] args){
		GregorianCalendar date = new GregorianCalendar();
		printdate(date);
		date.setTimeInMillis(1234567898765L);
		printdate(date);
	}
	public static void printdate(GregorianCalendar date){
		System.out.println(date.get(GregorianCalendar.YEAR)
		+" "+(date.get(GregorianCalendar.MONTH)+1)
		+" "+date.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
