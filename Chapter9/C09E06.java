class StopWatch{
	private long startTime;
	private long endTime;
	public StopWatch(){
		this.startTime = System.currentTimeMillis();
	}
	public void start(){
		this.startTime = System.currentTimeMillis();
	}
	public void stop(){
		this.endTime = System.currentTimeMillis();
	}
	public long getElapsedTime(){
		return endTime-startTime;
	}
}
public class C09E06 {
	public static void main(String[] args){
		StopWatch sw = new StopWatch();
		double array[] = new double[100000];
		randomArray(array);
		sw.start();
		sort(array);System.out.println("dsb");
		sw.stop();
		System.out.println("selection sort on 100,000 doubles executed in " +sw.getElapsedTime() + "ms");
	}
	public static void randomArray(double[] array){
		for(int i=0;i<array.length;i++){
			array[i] = Math.random()*100000;
		}
	}
	public static void sort(double[] array){
		for(int i = 0 ;i<array.length-1;i++){
			for(int j = i+1;j<array.length;j++){
				if(array[i]>array[j])
					swap(array,i,j);
			}
		}
	}
	public static void swap(double[] array,int index1,int index2){
		array[index1]=array[index1]+array[index2];
		array[index2]=array[index1]-array[index2];
		array[index1]=array[index1]-array[index2];
	}
}
