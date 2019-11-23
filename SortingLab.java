package lastInLab;

import java.lang.reflect.Array;
import java.util.Random;

public class SortingLab {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startTime;
		double finishTime;
		SortMethods run = new SortMethods();
		
		int[] arrayB100 = run.createArray(100);
		int[] arrayS100 = arrayB100.clone();
		int[] arrayB200 = run.createArray(200);
		int[] arrayS200 = arrayB200.clone();
		int[] arrayB500 = run.createArray(500);
		int[] arrayS500 = arrayB500.clone();
		int[] arrayB1000 = run.createArray(1000);
		int[] arrayS1000 = arrayB1000.clone();
		int[] arrayB10000 = run.createArray(10000);
		int[] arrayS10000 = arrayB10000.clone();

		
        
        startTime = System.currentTimeMillis();
        run.bubbleSort(arrayB100);
        finishTime = System.currentTimeMillis();

        System.out.println("The time in milliseconds to sort " + arrayB100.length + 
            " items is " + (finishTime - startTime));
        
        startTime = System.currentTimeMillis();
        run.selectionSort(arrayS100);
        finishTime = System.currentTimeMillis();
        
        System.out.println("The time in milliseconds to sort " + arrayS100.length + 
            " items is " + (finishTime - startTime));


    startTime = System.currentTimeMillis();
    run.bubbleSort(arrayB200);
    finishTime = System.currentTimeMillis();

    System.out.println("The time in milliseconds to sort " + arrayB200.length + 
        " items is " + (finishTime - startTime));
    
    startTime = System.currentTimeMillis();
    run.selectionSort(arrayS200);
    finishTime = System.currentTimeMillis();
    
    System.out.println("The time in milliseconds to sort " + arrayS200.length + 
        " items is " + (finishTime - startTime));


	startTime = System.currentTimeMillis();
	run.bubbleSort(arrayB500);
	finishTime = System.currentTimeMillis();
	
	System.out.println("The time in milliseconds to sort " + arrayB500.length + 
	    " items is " + (finishTime - startTime));
	
	startTime = System.currentTimeMillis();
	run.selectionSort(arrayS500);
	finishTime = System.currentTimeMillis();
	
	System.out.println("The time in milliseconds to sort " + arrayS500.length + 
	    " items is " + (finishTime - startTime));
	
	startTime = System.currentTimeMillis();
    run.bubbleSort(arrayB1000);
    finishTime = System.currentTimeMillis();

    System.out.println("The time in milliseconds to sort " + arrayB1000.length + 
        " items is " + (finishTime - startTime));
    
    startTime = System.currentTimeMillis();
    run.selectionSort(arrayS1000);
    finishTime = System.currentTimeMillis();
    
    System.out.println("The time in milliseconds to sort " + arrayS1000.length + 
        " items is " + (finishTime - startTime));
	
    startTime = System.currentTimeMillis();
    run.bubbleSort(arrayB1000);
    finishTime = System.currentTimeMillis();

    System.out.println("The time in milliseconds to sort " + arrayB10000.length + 
        " items is " + (finishTime - startTime));
    
    startTime = System.currentTimeMillis();
    run.selectionSort(arrayS10000);
    finishTime = System.currentTimeMillis();
    
    System.out.println("The time in milliseconds to sort " + arrayS10000.length + 
        " items is " + (finishTime - startTime));

	}
}
