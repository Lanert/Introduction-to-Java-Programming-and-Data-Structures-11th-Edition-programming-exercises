class MyInteger{
	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}

	public boolean isOdd(){
		if(value%2==1)
			return true;
		return false;
	}
	public boolean isEven(){
		if(value%2==0)
			return true;
		return false;
	}
	public boolean isPrime(){
		if(value==2||value==3){
			return true;
		}else if((value%6==1||value%6==5)&&value>4){
			int checkPoint = (int)Math.sqrt(value);
			for(int i = 5;i<=checkPoint;i++){
				if(value%i==0)
					return false;
			}
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isOdd(int value){
		if(value%2==1)
			return true;
		return false;
	}
	public static boolean isEven(int value){
		if(value%2==0)
			return true;
		return false;
	}
	public static boolean isPrime(int value){
		if(value==2||value==3){
			return true;
		}else if((value%6==1||value%6==5)&&value>4){
			int checkPoint = (int)Math.sqrt(value);
			for(int i = 5;i<=checkPoint;i++){
				if(value%i==0)
					return false;
			}
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger myinteger){
		return isOdd(myinteger.getValue());
	}
	public static boolean isEven(MyInteger myinteger){
		return isEven(myinteger.getValue());
	}
	public static boolean isPrime(MyInteger myinteger){
		return isPrime(myinteger.getValue());
	}
	
	public boolean equals(int value){
		if(this.value==value){
			return true;
		}else{
			return false;
		}
	}
	public boolean equals(MyInteger myinteger){
		return equals(myinteger.getValue());
	}
	
	public static int parseInt(String str){
		return Integer.parseInt(str);
	}
	public static int parseInt(char[] array){
		return parseInt(new String(array));
	}
}
public class C10E03 {
	public static void main(String[] args) {
		MyInteger one = new MyInteger(12);
		System.out.println("isodd:"+one.isOdd()+"  iseven:"+one.isEven()+"  isprime:"+one.isPrime());
		System.out.println("isodd:"+MyInteger.isOdd(5)+"  iseven:"+MyInteger.isEven(5)+"  isprime:"+MyInteger.isPrime(5));
		System.out.println("isodd:"+MyInteger.isOdd(one)+"  iseven:"+MyInteger.isEven(one)+"  isprime:"+MyInteger.isPrime(one));
		System.out.println("isequals:"+one.equals(12));
		System.out.println("isequals:"+one.equals(new MyInteger(12)));
		System.out.println("isequals:"+one.equals(5));
		System.out.println("isequals:"+one.equals(new MyInteger(5)));
	}
}
