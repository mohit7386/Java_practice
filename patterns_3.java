import java.util.*;
public class patterns_3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How many rows of stars you want to print");
        int num=sc.nextInt();
        int alpha=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(alpha+" ");
                alpha++;
            }
            
            System.out.println();
            sc.close();
        }
    }
    
}
