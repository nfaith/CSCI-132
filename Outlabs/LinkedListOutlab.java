package Outlab3;

import java.io.*;
import java.util.Scanner;

public class LinkedListOutlab {

	public static void main(String[] args) {
		Scanner fileIn = null;
		writingFile fileOut;
		
		int N = 10;
		int k = 4;
		int m = 3;
	
		try{
	        fileIn = new Scanner(new File(args[0]));
	    }catch(IOException e)
	    {
	        System.err.println(e);
	    }
	    fileOut = new writingFile("LinkedListProgram.txt");
	    fileOut.writeLn("Program 4");
	    fileOut.writeLn("----------");
	    while(fileIn.hasNext()){
	        N = fileIn.nextInt();
	        k = fileIn.nextInt();
	        m = fileIn.nextInt();
	        
	        if (N != 0 && k != 0 && m != 0){

	        	fileOut.writeLn("N = "+ N + ", k = "+ k+", m = "+m);
	        	fileOut.writeLn("Output");
	        	fileOut.writeLn("-------");
	        	LinkedList program = new LinkedList();
	    		for( int i = 2; i<= N; i++) {
	    			program.add(i);
	    		}

	    		fileOut.writeLn(program.compute(N, m, k));
	        }
	        else{
	        	fileOut.writeLn("End of Program 4");
	            System.exit(0);
	        }
	    }
		
	}

}
