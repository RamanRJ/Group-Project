/*
 * Ramanvir Singh Sahota
 * Student ID: 991542297
 * 
 */
package ca.sheridancollege.project;

/**
 *
 * @author hyper
 */
public class TestGame{
    
    static TestPlayer p1 = new TestPlayer();
    
    public static void main (String [] args){
            int compScore = 0;
            int userScore = 0;
    
   // public void play(){
       while(!(userScore==5 || compScore==5)){
        GroupOfCards c1 = new GroupOfCards();
        String compcard = (c1.getCompCards()).get((int)(Math.random() *  13 + 0)).getValue(); 
        String usercard = (c1.getUserCards()).get((int)(Math.random() *  13 + 0)).getValue(); 
        if(usercard.equals(compcard)){
             userScore++;
        }
        else{
        String compcar = (c1.getCompCards()).get((int)(Math.random() *  13 + 0)).getValue();
        if(compcar.equals(usercard)){
            compScore++;
        }
        else{
            continue;
        }
        }
 
        
    }
       System.out.println(p1.play() + "'s Score - " + userScore);
       System.out.println("Computer's Score - "+ compScore);
       if(userScore==5){
           System.out.println( "You Wins!");
       }
       else{
           System.out.println("Computer Wins!");
       }
    }
    
  //  public void declareWinner(){
        
   // }
    
}
