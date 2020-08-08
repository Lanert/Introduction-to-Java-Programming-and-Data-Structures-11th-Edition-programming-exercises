import java.util.Scanner;
class MyPoint{
	private double x;
	private double y;
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	
	public MyPoint(){
		this(0,0);
	}
	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint point){
		return distance(point.getX(),point.getY());
	}
	public double distance(double x1,double y1){
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}
	public static double distance(MyPoint p1,MyPoint p2){
		double x1 = p1.getX();
		double y1 = p1.getY();
		double x2 = p2.getX();
		double y2 = p2.getY();
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
}
public class C10E04 {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10,30.5);
		System.out.println("the distance between p1 and p2 is "+MyPoint.distance(p1,p2));
		System.out.println("the distance between p1 and p2 is "+p1.distance(p2));
		System.out.println("the distance between p1 and p2 is "+p1.distance(p2.getX(),p2.getY()));
	}
}
