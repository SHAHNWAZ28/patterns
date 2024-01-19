import java.util.*;
public class javaBasics{
    public static void pyramid_rectangle(int n){
        // outer loop
        for(int i = 1; i<=n; i++){
            // spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" "); 
            }
            for(int k = 1; k<=i; k++){
                // stars
                System.out.print("*");
            }
            System.out.println();
        
        }
    }
    public static void main(String args[]){
       pyramid_rectangle(4);
    

       }
    
        
    }
