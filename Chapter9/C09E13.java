import java.util.Scanner;
class Location{
	int row;
	int column;
	double maxValue;
}
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double[][] array = creatArray(input);
		Location largest = locateLargest(array);
		System.out.printf("The location of the largest element is %f at (%d, %d)",largest.maxValue,largest.row,largest.column);
	}
	public static double[][] creatArray(Scanner input){
		System.out.print("Enter the number of rows and columns in the array:");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] array = new double[row][column];
		System.out.println("Enter the array");
		for(int i = 0;i<array.length;i++){
			for(int j = 0;j<array[i].length;j++){
				array[i][j]=input.nextDouble();
			}
		}
		return array;
	}
	public static Location locateLargest(double[][] array){
		Location largest = new Location();
		largest.maxValue = array[0][0];
		largest.row = 0;
		largest.column = 0;
		for(int i = 0;i<array.length;i++){
			for(int j = 0;j<array[i].length;j++){
				if(array[i][j]>largest.maxValue){
					largest.maxValue = array[i][j];
					largest.row = i;
					largest.column = j;
				}
			}
		}
		return largest;
	}
}
