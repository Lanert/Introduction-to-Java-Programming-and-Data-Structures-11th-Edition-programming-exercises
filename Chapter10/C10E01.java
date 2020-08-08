import java.util.*;
class Time{
	private int hour;
	private int minute;
	private int second;
	public Time(){
		this(System.currentTimeMillis());
	}
	public Time(Long l){
		l/=1000;
		second =(int)(l%60);
		minute = (int)(l/60%60);
		hour = (int)(l/3600%24);
	}
	public Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public void setTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public String toString(){
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
	}
}
public class Main{
	public static void main(String[] args){
		Time time1 = new Time();
		Time time2 = new Time(555550000L);
		Time time3 = new Time(5,23,55);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
	}
}
