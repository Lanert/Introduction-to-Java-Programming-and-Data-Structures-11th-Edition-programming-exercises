class Account{
	private int id = 0;
	private double blance = 0;
	private double annualIntereatRate = 0;
	private java.util.Date dateCreated;
	public Account(int id,double blance){
		this.id = id;
		this.blance = blance;
		dateCreated = new java.util.Date();
	}
	public Account(){
		this(0,0);
	}
	//get methods
	public int getid(){
		return id;
	}
	public double getblance(){
		return blance;
	}
	public double getannualIntereatRate(){
		return annualIntereatRate;
	}
	public java.util.Date getdateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return getannualIntereatRate()/12;
	}
	public double getMonthlyInterest(){
		return getMonthlyInterestRate()*getblance();
	}
	//set methods
	public void setid(int id){
		this.id = id;
	}
	public void setblance(double blance){
		this.blance = blance;
	}
	public void setannualIntereatRate(double annualIntereatRate){
		this.annualIntereatRate = annualIntereatRate/100;
	}
	public void withDraw(double blance){
		setblance(getblance()-blance);
	}
	public void deposit(double blance){
		setblance(getblance()+blance);
	}
	public String toString() {
    return "balance: " + getblance() + "\nmonthly interest: " +
      getMonthlyInterest() + "\ndate created: " + getdateCreated();
  }
}
public class C09E07 {
	public static void main(String[] args){
		Account account = new Account(1122,20000);
		account.setannualIntereatRate(4.5);
		account.withDraw(2500);
		account.deposit(3000);
		System.out.println(account.toString());
	}
}
