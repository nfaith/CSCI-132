/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refquessum2017;

/**
 *
 * @author Hunter
 */
public class RefQuesSum2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code        
        Baseball playerOne = new Baseball("Geronimo");
        Baseball playerTwo = new Baseball("Seaver");
        int num = 5;
        playerTwo = playerOne.changeName(playerOne, playerTwo, num);
        System.out.println(playerTwo.getName());     //8
        System.out.println(num);                  //9
        System.out.println( playerOne.getName());    //10
        System.out.println(Baseball.challenge);  

    }
    
}
