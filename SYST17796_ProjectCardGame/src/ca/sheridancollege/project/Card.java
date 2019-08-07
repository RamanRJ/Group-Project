/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private String value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   public static final String [] VALUES = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
    /**
     * @return the suit
     */
    public String getSuit() 
    {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit)
     {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public String getValue() 
    {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) 
    {
        this.value = value;
    }
    
    public int randomCard(){
     int r = (int) (Math.random() *  13 + 1);
     return r;
    }
   
    public int randomSuit(){
     int r = (int) (Math.random() * 4);
     return r;
    }
   
    
}
