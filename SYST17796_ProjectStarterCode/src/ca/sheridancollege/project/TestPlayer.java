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
    

    String id;
    public String play(){
    Scanner in = new Scanner(System.in);
     System.out.println("Enter your Player ID");
     id=in.nextLine();
     return id;
     
    }
    public static boolean checkName(String id){
    if(id==""){
    return false;
}
    else{
        return true;
    }
    

    }
}
