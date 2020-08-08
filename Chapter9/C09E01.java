class Rectangle{
	double width = 1;
	double height = 1;
	public Rectangle(){
		
	}
	public Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	public double getArea(){
		return width*height;
	}
	public double getPerimeter(){
		return 2*(width+height);
	}
}
public class Main{
	public static void main(String[] args){
		Rectangle r_a1 = new Rectangle(4,40);
		Rectangle r_a2 = new Rectangle(3.5,35.9);
		System.out.println("The attributes of Rectangle1:");
		showAttributes(r_a1);
		System.out.println("The attributes of Rectangle2:");
		showAttributes(r_a2);
	}
	public static void showAttributes(Rectangle angle){
		System.out.println("The width of Rectangle is"+angle.width);
		System.out.println("The height of Rectangle is"+angle.height);
		System.out.println("The Area of Rectangle is"+angle.getArea());
		System.out.println("The Perimeter of Rectangle is"+angle.getPerimeter());
	}
}
