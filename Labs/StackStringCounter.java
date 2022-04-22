package lastInLab;

import java.util.Scanner;

public class StackStringCounter {
	String s;
	Scanner console = new Scanner(System.in);
	char array[] = new char[20];
	int index = 0;

	public void beginFun()
	{
	String input;
	do{
		System.out.println("Give a string: ");
		input = console.next();
		
		 for(int i=0;i < input.length(); i++){ 

		    if(index == 0) {
		            
		    	push(Character.valueOf(input.charAt(i)));
		    
		    }
		    else if(array[index-1]!=input.charAt(i)){
		        
		    	pop();
		    
		    }
		    else if(array[index-1]==input.charAt(i)){   
		    	
		        push(input.charAt(i));
		    }
		    
		    } 

		    if(index==0){
		    
		        System.out.println("Accept String "+input); 
		    }
		    else
		    {
		    System.out.println("Reject String "+input+" "+index); 
		    
		    index=0;
		    }


	}while(!input.equals("-1"));



	}
	private void pop(){
		
		index--;

	}
	private void push(char itemIn)
	{
		array[index]= itemIn; 
	    index++;
	}
}
