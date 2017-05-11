/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure2;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class Adventure2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        String userInput;
     
        System.out.print("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" + "\"kitchen\"?\n" + ">" );
        userInput = keyboard.next();
        count++;
        
        while(count > 0){
        
            if("kitchen".equals(userInput) ){
                System.out.print("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\"or go \"back\".\n" + ">");
                userInput = keyboard.next();
                if("refrigerator".equals(userInput)){
                
                    System.out.print("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" + "Would you like to eat some of the food? (\"yes\" or \"no\")\n" + ">");
                    userInput = keyboard.next();
                    if("yes".equals(userInput)){
                    
                        System.out.println("The food is slimy and foul, but you manage to choke it down. Your stomach\n" +"starts jumping like a frog in hot water.  You feel faint. Sliding to the\n" +"floor, the darkness closes in.\n" +"\n" +"You have died.\n Game Over");
                        count = 0;
                    }else{
                    
                        System.out.println("As you turn around you get a feeling someone is in the room with you so you ninja flip out the window and run home.\n Game over.");
                        count = 0;
                    }
                }else{
                
                    System.out.print("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" + "\"kitchen\"?\n" + ">" );
                    userInput = keyboard.next();
                }
            }else{
            
                System.out.print("Upstairs you see a hallway.  At the end of the hallway is the master\n" + "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Or, you can\n" + "go back \"downstairs\". Where would you like to go?\n" + ">");
                userInput = keyboard.next();
                if("bedroom".equals(userInput)){
                
                    System.out.println("As you walk in the bed room a ghost attacks you and you die.\n Game over.");
                    count = 0;
                }else if("bathroom".equals(userInput)){
                
                   System.out.println("You walk in and slip on the wet floor, break your neck & die.\n Game over."); 
                   count = 0;
                }else{
                
                    System.out.print("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" + "\"kitchen\"?\n" + ">" );
                    userInput = keyboard.next();
                }
            }
            
        }
    }
    
}
