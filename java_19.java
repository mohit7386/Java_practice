//Program to find odd numbers between 1 to n.
import java.util.*;
public class java_19 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range you want to print odd numbers:-");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            if(i%2!=0){
                System.out.println("ODD Number " +i);
                sc.close();
            }
            
            

        }
    
    }
    
}
