import java.util.*;
public class Function_1 {
   static int add(int a,int b){
        return a+b;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of Num1 and Num2:-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= add(a,b);
        System.out.println("The sum of Num1 and Num2 is "+sum);
        sc.close();
    }
    
}
