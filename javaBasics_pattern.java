import java.util.*;
public class javaBasics{
    public static void hollow_rectangle(int totRows, int totColm){
        // outer loop
        for(int i = 1; i<=totRows; i++){
            // inner loop
            for(int j = 1; j<=totColm; j++){
                // boundry (i,j)
                if(i==1|| i == totRows || j== 1 ||j== totColm){
                    // boundry cell
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");

                } 
                
            }
            System.out.println();
        
        }
    }
    public static void main(String args[]){
       hollow_rectangle(4,5);
    

       }
    
        
    }
