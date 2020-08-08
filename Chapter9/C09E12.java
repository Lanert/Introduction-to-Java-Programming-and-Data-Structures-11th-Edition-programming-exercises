import java.util.Scanner;
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
public class C09E12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1,y1,x2,y2,x3,y3,x4,y4:");
		double[][] point = new double[4][2];
		for(int i=0;i<point.length;i++){
			point[i][0]=input.nextDouble();
			point[i][1]=input.nextDouble();
		}
		double a = point[1][1] - point[0][1];
		double b = point[0][0] - point[1][0];
		double c = point[3][1] - point[2][1];
		double d = point[2][0] - point[3][0];
		double e = point[0][0]*point[1][1]-point[0][1]*point[1][0];
		double f = point[2][0]*point[3][1]-point[2][1]*point[3][0];
		LinnerEquation equ1 = new LinnerEquation(a,b,c,d,e,f);
		System.out.println(equ1);
	}
}
