import java.util.*;
public class patterns_1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number how many stars you want to print?");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
              System.out.print("*");
              sc.close();
        }
        
    }
    
}
