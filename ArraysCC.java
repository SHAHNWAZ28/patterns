import java.util.*;
public class ArraysCC{
    public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter phy marks:");
        marks[0] = sc.nextInt();// input
        System.out.println("enter chem marks:");
        marks[1] = sc.nextInt();// input
        System.out.println("enter maths marks :");
        marks[2] = sc.nextInt();// input in array
        System.out.println("phy : " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("maths: " + marks[2]);
        marks[2] = 100;// update in array
        System.out.println("maths:"+ marks[2]);


    }
    
}
