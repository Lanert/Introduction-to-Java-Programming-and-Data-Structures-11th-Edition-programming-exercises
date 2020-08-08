class RegularPolygon{
	private int n;
	private double side;
	private double x;
	private double y;
	public RegularPolygon(int n,double side,double x,double y){
		this.n=n;
		this.side = side;
		this.x=x;
		this.y=y;
	}
	public RegularPolygon(){
		this(3,1,0,0);
	}
	public RegularPolygon(int n,double side){
		this(n,side,0,0);
	}
	public void setN(int n){
		this.n=n;
	}
	public void setSide(double side){
		this.side = side;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
	}
	public int getN(){
		return n;
	}
	public double getSide(){
		return side;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getPerimter(){
		return getN()*getSide();
	}
	public double getArea(){
		return getN()*getSide()*getSide()/4/Math.tan(Math.PI/n);
	}
}
public class C09E09 {
	public static void main(String[] args){
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon(6,4);
		RegularPolygon rp3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("    Perimter  Aera");
		System.out.printf("rp1 %8f  %f\n",rp1.getPerimter(),rp1.getArea());
		System.out.printf("rp1 %8f  %f\n",rp2.getPerimter(),rp2.getArea());
		System.out.printf("rp1 %8f  %f\n",rp3.getPerimter(),rp3.getArea());
	}
}
