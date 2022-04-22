package lastInLab;

import java.util.Random;

	public class SortMethods {
		int[] array;
		
		public int[] createArray(int numberOfNums) {
			array = new int[numberOfNums];
			Random rand = new Random();
			for(int i = 0; i < numberOfNums; i++) {
				int number = rand.nextInt(100);
				array[i]= number;
			}
			return array;
		}
		
		public void bubbleSort(int[] arrayIn) {
			boolean bigger = true;
			do {
			for(int i= 0; i < arrayIn.length; i++) {
				for (int j = i + 1; j < arrayIn.length; j++) {
					if(arrayIn[i] > arrayIn[j]) {
						int temp = arrayIn[j]; 
						arrayIn[j] = arrayIn[i];
						arrayIn[i] = temp;
					}
				}
			bigger = false;
			}
			}while(bigger);
			
		}
		
		public void selectionSort(int[] arrayIn) {
			int min;
			for(int i = 0; i< arrayIn.length-1; i++) {
				min = i;
				for(int j = i+1; j < arrayIn.length; j++) {
					if (array[j] < array[min]) {
						min = j;	
					}	
				}
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
				
			}
		}
		
			
		
		public String toString() {
			String printable = "";
			for (int i =0; i< array.length;i++) {
					printable += (array[i]+" ");
				}
			return printable;
		}
}
