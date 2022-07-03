import java.util.*;
public class java_18 {
    public static void main(String[] args){
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:-");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if (num%i==0)
            c++;

        }
        if(c==2){
            System.out.println("Prime number");
        }
        else
        System.out.println("Not a Prime Number");
        sc.close();


    }
    
}
