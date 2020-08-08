import java.util.Scanner;
class StackOfInteger{
	private int[] elements;
	private int size = 0;
	
	public StackOfInteger(){
		//There are 16 bits by default.
		this(16);
	}
	public StackOfInteger(int strong){
		elements = new int[strong];
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	public int pop(){
		if(!isEmpty()){
			return elements[--size];
		}else{
			return -1;
		}
	}
	public void push(int value){
		if(size==elements.length){
			int[] temp = new int[2*size];
			System.arraycopy(elements,0,temp,0,elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		StackOfInteger mystack = new StackOfInteger();
		//Stack prime factors
		for(int i = 2;i<Math.sqrt(num);i++){
			while(true){
				if(num%i==0){
					mystack.push(i);
					num/=i;
				}else{
					break;
				}
			}
		}
		if(num!=1){
			mystack.push(num);
		}
		//Put prime factors out of the stack
		while(!mystack.isEmpty()){
			System.out.print(mystack.pop()+" ");
		}
	}
}
