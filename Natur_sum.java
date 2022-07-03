import java.util.*;
public class Natur_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Printing the sum of Natural Numbers:-");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            sum= sum + i;
        }
            System.out.println("The sum of Natural numbers is "+sum);
            sc.close();

        }
    }
    

