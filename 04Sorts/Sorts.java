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
		System.out.println(Arrays.toString(data));
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
	public static void main(String[] args){
		int[] testdata= new int[] {5,4,3,2,1,0}; 
		swappity(testdata,0,3);
		selectionSort(testdata);
	}
}