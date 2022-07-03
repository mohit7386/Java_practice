//Printing the Natural Numbers from 1 to n.
import java.util.*;
public class do_While {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range of Natural Numbers:-");
        int num=sc.nextInt();
        int i=0;
        do{
            System.out.println(+i);
            i++;
        }
        while(i<=num);
        sc.close();
    }  
}
