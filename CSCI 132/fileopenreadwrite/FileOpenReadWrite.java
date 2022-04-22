/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileopenreadwrite;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Hunter
 */
public class FileOpenReadWrite {

    Scanner fin;
    FileOut fout;
    
    FileOpenReadWrite(String fileName){
        try{
            fin = new Scanner(new File(fileName));
        }catch(IOException e)
        {
            System.err.println(e);
        }
        fout = new FileOut("output.txt");
        
        while(fin.hasNext()){
            int num = fin.nextInt();
        
            System.out.println(num);
            if (num !=0){
                fout.write(num + " ");
            }
            else{
                System.exit(0);
            }
            }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            new FileOpenReadWrite(args[0]);
        }catch(Exception e)
        {
            System.out.println("Usage: Need file input name");
            System.err.println(e);
        }
    }
    
}
