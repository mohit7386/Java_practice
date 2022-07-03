import java.util.*;
public class While_ {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        //print Whole numbers from 1 to 10 using while loop
        int i=0;
        System.out.println("Enter The Range of Whole numbers:-");
        int num=sc.nextInt();
        while(i<=num){
            System.out.println(i);
            i++;
            sc.close();
        }
    }
    
}
