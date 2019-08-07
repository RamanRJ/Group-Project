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
public class TestGame {
    
    static TestPlayer p1 = new TestPlayer();
    static int compScore = 0;
    static int userScore = 0;
    
    public static void main (String [] args){
            
            
            
            
            p1.play();
    
   // public void play(){
       while(!(userScore==5 || compScore==5)){
        GroupOfCards c1 = new GroupOfCards();
        String compcard = (c1.getCompCards()).get((int)(Math.random() *  13 + 0)).getValue(); 
        String usercard = (c1.getUserCards()).get((int)(Math.random() *  13 + 0)).getValue(); 
        if(usercard.equals(compcard)){
             ++userScore;
             System.out.println("Computer throws " +compcard + " and you thrown " + usercard +
                     " \nBut you thrown it above the computer's card");
             System.out.println("Therefore, you wins this round");
             System.out.println("Your score: "+userScore +"\nComputer Score: "+compScore);
        }
        else{
        String compcar = (c1.getCompCards()).get((int)(Math.random() *  13 + 0)).getValue();
        if(compcar.equals(usercard)){
            ++compScore;
            System.out.println("Computer throws " +compcar + " and you thrown " + usercard +
                     " \nBut computer thrown it above your card");
             System.out.println("Therefore, computer wins this round");
             System.out.println("Your score: "+userScore +"\nComputer Score: "+compScore);
        }
        else{
            continue;
        }
        }
 
        
    }
       winner();
    }
       public static void winner(){
       System.out.println( "\nFinal Score:\nYour Score - " + userScore);
       System.out.println("Computer's Score - "+ compScore);
       if(userScore==5){
           System.out.println( "You Wins!");
       }
       else{
           System.out.println("Computer Wins!");
           
           
       }
    
  }
}