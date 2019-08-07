/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards extends Card
{
   
    //The group of cards, stored in an ArrayList
    private static ArrayList <Card> compcards = new ArrayList<Card>();
    private static ArrayList <Card> usercards = new ArrayList<Card>();

         public static ArrayList<Card> getCompCards(){
        //Creating compcards
        for(int dex =0; dex < 2; dex++){ 
          String str = SUITS[dex];
        for (int i=0; i < 13; i++)
        {
            Card c = new Card();
            c.setSuit(str);
            c.setValue(VALUES[i]);
            compcards.add(c);
        }
        }
        return compcards;
         }
        
         public static ArrayList<Card> getUserCards(){
        //Creating usercards
        for(int dex =2; dex < 4; dex++){ 
          String str = SUITS[dex];
        for (int i=0; i < 13; i++)
        {
            Card c = new Card();
            c.setSuit(str);
            c.setValue(VALUES[i]);
            usercards.add(c);
        }
        return usercards;
        }
        
        //Printing the cards of compcards array
        //System.out.println((compcards.get(0)).getValue() + "," +(compcards.get(0)).getSuit());
        //System.out.println((compcards.get(1)).getValue() + "," +(compcards.get(1)).getSuit());
        //System.out.println(compcards.toString());
        
        return compcards;
    }
        
    
}//end class
