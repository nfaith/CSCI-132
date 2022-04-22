/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchwhileexamples;

import java.util.Scanner;

/**
 *
 * @author Hunter
 */
public class SwitchWhileExamples {

    public void myScannerMethod()
    {
        Scanner console;
        console = new Scanner(System.in);
        System.out.println("Give me a word");
        String word = console.nextLine();
        System.out.println("My Word is " + word);
        
        int number = 0;
        //while(true)  //(number  != -1)
        do{
            System.out.println("Give me a number:");
            number = (int)console.nextInt();
            System.out.println("my number is : " + number);
            /*if(number == -1)
            {
                System.out.println("Goodbye");
                break;
            }*/
                
        }while(number != 1);
    }
    public void switchExample()
    {
        int choice = 1;
       /* 
        if(choice == 1)
        {
            System.out.println(1);
        }
        else if (choice == 2)
        {
            System.out.println(2);
        }
        else if (choice == 3)
        {
            System.out.println(3);
        }
        else if(choice == 4)
        {
            System.out.println(4);
        }
        else
            System.out.println("anything else");
        */
        switch(choice)
        {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("anything else");
        }
        
    }
    public void continueExample()
    {
        for(int i = 0; i<6; i++)
        {
           if(i == 4)
               continue;
           System.out.println(i);
           
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwitchWhileExamples swe = new SwitchWhileExamples();
        //swe.myScannerMethod();
        swe.switchExample();
        
        swe.continueExample();
    }
    
}
