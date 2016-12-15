public class Sorts{
	public static String name(){
		return "10.Leung.Brian";
	}
	public static void swappity(int[] data, int pos1, int pos2){
		int temp = 0;
		temp = pos2+0;
		data[pos2] = pos1+0;
		data[pos1] = temp+0;
		return;
	}
	public static void selectionSort(int[] data){
		int mem = 0;
		int whereto = 0;
		int wheretoswap = 0;
		int temp = 0;
		for (int j = 0;j<data.length-1;j++){
			for (int i = j+0; i<data.length-1; i++){
				if (data[i] < mem){
					mem = data[i];
					wheretoswap = i+0;
				}
			}
			swappity(data,
		}
	}
	public static void insertionSort(int[] data){
	}
	public static void main(String[] args){
		
	}
}