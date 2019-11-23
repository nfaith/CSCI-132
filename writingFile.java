package Outlab3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class writingFile {
	PrintStream fileOut;
	
	public writingFile(String filename) {
		
		try{
			fileOut= new PrintStream ( new FileOutputStream(filename));
		 }catch(IOException fo){
		     System.out.println(fo); 
		  }
		}

	   public void writeLn(String out){
	         fileOut.println(out);
	   }
	   public void writeLn(int out){
	         fileOut.println(out);
	   }
	  
	/*following all write on one line*/

	  public void write(String out){
	         fileOut.print(out);
	   }

	   public void write(int out) {
	         fileOut.print(out);
	   }



}
