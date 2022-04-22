import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileRead newList = new FileRead();
        newList.readIn();


        // This code will only work if your file is in your project folder
        
        /*Scanner insertFN = new Scanner(System.in);

        List list = new List(); // calls linked list class ("List")

        System.out.println("Enter the name of your file: ");
        String fileName = insertFN.nextLine();
        File inputtext = new File(fileName);
        try {
            // basically all my logic as to why these things might work or not.
            insertFN = new Scanner(inputtext);
            while(insertFN.hasNextLine()){

                String[] line = insertFN.nextLine().split(" ");
                int amtPple = Integer.parseInt(line[0]);
                int selectK = Integer.parseInt(line[1]);
                int selectM = Integer.parseInt(line[2]);
                System.out.println("\n\n");
                System.out.println("Program 3");
                System.out.println("----------");
                System.out.println("Number of Runners = " + amtPple + ", Selector K = " + selectK + ", Selector M = " + selectM);
                System.out.println("----------");
                System.out.println("Output");
                System.out.println("----------\n");

                for (int i = 1; i <= amtPple; i++) {
                    list.add(i);
                }
                Node first = list.first;
                Node last = list.first.getPrevious();
                while (!list.empty())
                {
                    for(int i=1;i<selectK;i++){
                        first = first.getNext();
                    }
                    for(int i=1;i<selectM;i++){
                        last = last.getPrevious();
                    }

                    if(first.getData() == last.getData()){
                        list.print(list.delete(first));
                        list.removeRunner(list.delete(first));
                        first = first.getNext();
                    }
                    else{
                        list.print(list.delete(first));
                        list.removeRunner(list.delete(first));

                        first = first.getNext();
                        boolean check = list.delete(first) == list.delete(last);
                        list.print(list.delete(last));
                        list.removeRunner(list.delete(last));
                        if(check){
                            first = list.first;
                        }
                        System.out.print("\n");

                    }
                    last = last.getPrevious();
                }
            }
            insertFN.close();
        } catch (IOException e){
        System.out.println("This doesn't exist");
        } // ends the catch 
        */
    } // ends main

} // ends driver

