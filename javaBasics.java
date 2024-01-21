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
    public static void pyramid_rectangle(int n){
        // outer loop
        for(int i = 1; i<=n; i++){
            // inner loop
            for(int j = 1; j<=n-i; j++){
                System.out.print(" "); 
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        
        }
    }
    public static void pyramid_rectangle_number(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    public static void Zero_one(int n){
        //outer loop
        for(int i = 1; i<= n; i++){
            //inner loop
            for(int j = 1; j<= i; j++){
                if((i+j)% 2 == 0){
                    System.out.print("1");
                } 
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
       Zero_one(5);
       }    
    }
