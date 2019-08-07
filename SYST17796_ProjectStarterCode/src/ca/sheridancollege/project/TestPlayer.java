/*
 * Ramanvir Singh Sahota
 * Student ID: 991542297
 * 
 */
package ca.sheridancollege.project;
import java.util.Scanner;
/**
 *
 * @author hyper
 */
public class TestPlayer extends Player {
    

    
    public String play(){
    Scanner in = new Scanner(System.in);
     System.out.println("Enter your Player ID");
     String id=in.nextLine();
     return id;
     
    }
    
}
