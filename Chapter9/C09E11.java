class LinnerEquation{
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	public LinnerEquation(double a,double b,double c,double d,double e,double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getD(){
		return d;
	}
	public double getE(){
		return e;
	}
	public double getF(){
		return f;
	}
	public boolean isSolvable(){
		if(!(getA()*getD()==getC()*getB())){
			return true;
		}else{
			return false;
		}
	}
	public double getX(){
		return (getE()*getD()-getB()*getF())/(getA()*getD()-getC()*getB());
	}
	public double getY(){
		return (getA()*getF()-getE()*getC())/(getA()*getD()-getC()*getB());
	}
	public String toString(){
		if(isSolvable()){
			return "The intersection is("+getX()+","+getY()+").";
		}else{
			return "The equation has no solution.";
		}
	}
}
public class C09E11{
	public static void main(String[] args){
		LinnerEquation equ1 = new LinnerEquation(9,4,3,-5,-6,-21);
		LinnerEquation equ2 = new LinnerEquation(1,2,2,4,4,5);
		System.out.println("equ1 "+equ1);
		System.out.println("equ2 "+equ2);
	}
}
