class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	public QuadraticEquation(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
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
	public double getDiscriminant(){
		return getB()*getB()-4*getA()*getC();
	}
	public double getRoot1(){
		if(!(getDiscriminant()<0)){
			return (-getB()+Math.sqrt(getDiscriminant()))/2/getA();
		}else{
			return 0;
		}
	}
	public double getRoot2(){
		if(!(getDiscriminant()<0)){
			return (-getB()-Math.sqrt(getDiscriminant()))/2/getA();
		}else{
			return 0;
		}
	}
	public String toString(){
		if(getDiscriminant()>0){
			return "The equation has two root: "+getRoot1()+" and "+getRoot2();
		}else if(getDiscriminant()==0){
			return "The equation has one root: "+getRoot1();
		}else{
			return "The equation is no root";
		}
	}
}
public class C09E10 {
	public static void main(String[] args){
		QuadraticEquation equ1 = new QuadraticEquation(1,3,1);
		QuadraticEquation equ2 = new QuadraticEquation(1,2,1);
		QuadraticEquation equ3 = new QuadraticEquation(1,2,3);
		System.out.println("equ1 "+equ1);
		System.out.println("equ2 "+equ2);
		System.out.println("equ3 "+equ3);
	}
}
