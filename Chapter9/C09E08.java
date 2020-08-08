class Fan{
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	private int speed;
	private double radious;
	private boolean on;
	private String color;
	
	public Fan(){
		this(SLOW,5,false,"blue");
	}
	public Fan(int speed,double radious,boolean on,String color){
		this.speed = speed;
		this.radious = radious;
		this.on = on;
		this.color = color;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void setRadious(double radious){
		this.radious = radious;
	}
	public void setOn(boolean on){
		this.on = on;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public int getSpeed(){
		return speed;
	}
	public double getRadious(){
		return radious;
	}
	public boolean getOn(){
		return on;
	}
	public String getColor(){
		return color;
	}
	
	public String toString(){
		if(getOn()){
			return "the fan speed:"+getSpeed()+
			"\nthe fan color:"+getColor()+
			"\nthe fan radious:"+getRadious();
		}else{
			return "fan is off";
		}
	}
}
public class Main{
	public static void main(String[] args){
		Fan fan1 = new Fan(Fan.FAST,10,true,"yellow");
		Fan fan2 = new Fan(Fan.MEDIUM,5,false,"blue");
		System.out.println("fan1\n"+fan1.toString());
		System.out.println("fan2\n"+fan2.toString());
	}
}
