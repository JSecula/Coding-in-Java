//Jason SEcula
//Cse1102
//Lab7 Array things
//Reynoldo
import java.lang.reflect.Array;
import java.util.Random;

public class Main {
	public static Random rand = new Random();
	static int[] generateArray (int size){
		      int[] array = new int[size];
		      int maxNum = 100;
		      
	for (int i = 0; i< array.length; i++){
			  array [i] = rand.nextInt(maxNum);
		  }	  
		return array;
		}
	public static void showArray(int[] anArray)    {
			for (int num : anArray)
					System.out.print(num + "");
			System.out.println();
		}
	
	
		public static void main(String args[]){
			int[] array = generateArray(50);
				showArray(array);
				sort(array);
				showArray(array);
			
		}
		
	 static int min(int[] array) {
		int CurrMin = 100;
		for(int i : array)
			if(i < CurrMin)
				CurrMin = i;
				System.out.println("The Minimum array value is " + CurrMin);
		return CurrMin;
	}
	
	public static int locateMin(int[] array, int start) {
		int CurrMin = 100;
		int minIndex = 0;
		for(int n = start; n < array.length; n++)
			if(array[n] < CurrMin) {
				CurrMin = array[n];
				minIndex = n;
		System.out.println("The legthn of the array is "+ n);
			}
		return minIndex;		
	}
	public static int max(int[] array) {
		int CurrMax = 50;
		for(int i : array)
			if(i > CurrMax) 
				CurrMax = i;
				System.out.println("The Max value is "+ CurrMax);
		return CurrMax;
	}

	static void swap(int[] array, int loc1, int loc2) {
		int temp = array[loc1];
		array[loc1] = array[loc2];
		array[loc2] = temp;		
	}
	
	static void sort(int[] array) {
		for(int n = 0; n < array.length; n++) {
			swap(array, n, locateMin(array, n));
		}
}
}