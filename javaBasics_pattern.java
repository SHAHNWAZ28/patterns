import java.util.*;
public class javaBasics{
    public static void binToDec(int n){
        int pow = 0;
        int dec = 0;
        while (n > 0){
            int lastdigit = n%10;
            dec = dec + (lastdigit* (int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.print("decimal number is = "+ dec );
    }
    public static void decToBin(int n){
        int pow = 0;
        int binNum = 0;
        while(n > 0){
            int rem = n % 2;
            binNum  = binNum +( rem*(int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println(" binary number is =" + binNum);

    }
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
