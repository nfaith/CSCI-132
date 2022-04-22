import java.util.*;
import java.io.*;
        

public class FileRead
{
    PrintWriter writer; // write to file
    Scanner scanner = new Scanner(System.in);
    String inFile;
    int line;

    // Read N,K, and M values from input file
    public void readIn() throws UnsupportedEncodingException, FileNotFoundException
    {
        writer = new PrintWriter("LinkedListProgram.txt", "UTF-8");//Create output file
        System.out.println("File name? ");
        inFile = scanner.nextLine();
        try {
            System.out.println("Program 3");
            //open the file that the user inputs
            FileReader fileName = new FileReader(inFile);
            Scanner fileRead = new Scanner(fileName);
            int sum = 1;
            int n, k, m;
            n = 1;
            k = 1;
            m = 1;
            while (sum != 0) {
            sum = 0;
            n = fileRead.nextInt(); // Read n
            k = fileRead.nextInt(); // Read k
            m = fileRead.nextInt(); // Read m
            sum = n + k + m; // sum n, k and m. if sum is 0, then it is end of file
            List LL = new List(n,writer); // Create an object of LinkedList
            if (sum != 0) { // if the sum is not 0 (its not the end of the file), call LinkedList method
                 System.out.println("Amt Runners: " + n + " Selector K: " + k + " Selector M: " + m);
                 System.out.println("-----------\n");
                 System.out.println("Output");
                 System.out.println("-------\n");
                 LL.candidateSelection(n, k, m);
            }else{
                break;
            }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File doesn't exist.");
        }
    }
}