import java.util.*;
public class Sorts{
	public static String name(){
		return "10.Leung.Brian";
	}
	public static void swappity(int[] data, int pos1, int pos2){
		int temp=0;
		temp=data[pos2];
		data[pos2]=data[pos1];
		data[pos1]=temp;
		//System.out.println(Arrays.toString(data));
	}
	public static void selectionSort(int[] data){
		int mem=data[0];
		int whereto=0;
		int wheretoswap=0;
		for (int j=0;j<data.length;j++){
			for (int i=j;i<data.length;i++){
				if (data[i] < mem){
					mem=data[i]+0;
					wheretoswap=i+0;
				}
			}
			swappity(data,whereto,wheretoswap);
			whereto+=1;
		}
	}
	public static void insertionSort(int[] data){
	}
	public static void bubbleSort(int[] data){
		int in1 = 1;
		int streak = 0;
		while (true){
			if (data[in1-1] >= data[in1]){
				streak = 0;
				swappity(data,in1,in1-1);
			}else{
				System.out.println("Fine" + in1);
				streak+=1;
				if (streak == data.length-1){
					break;
				}
			}
			System.out.println(Arrays.toString(data)+": "+(in1-1));
			/*try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println("Nothing happened.");
			}*/
			if (in1 == data.length-1){
				in1 = 0;
			}
			in1+=1;
		}
		System.out.println(Arrays.toString(data)+": DONE");
			
	}	
	public static void main(String[] args){
		int[] testdata= new int[] {20,5,3,9,6,2,7,4}; 
		//System.out.println("Try:");
		bubbleSort(testdata);
	}
}