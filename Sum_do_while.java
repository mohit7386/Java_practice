//Program to print sum of number from 1 to n.
import java.util.*;
public class Sum_do_while {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Range Where you want to print the sum of numbers:-");
    float num=sc.nextFloat();
    int i=0;
    int sum=0;
    do{
        System.out.println(+i);
        i++;
        sum=sum+i;
    }
    while(i<=num);
    System.out.println(sum);
    sc.close();
    }
    
}
