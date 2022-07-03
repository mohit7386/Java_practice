import java.util.*;
public class patterns_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number how many rows of stars you want to print:-");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
                System.out.println();
                sc.close();
         
        }
    }
    
}
