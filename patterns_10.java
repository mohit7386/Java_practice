import java.util.*;
public class patterns_10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range:-");
        int num=sc.nextInt();
        for(int i=num;i>=1;i--){
            for(int j=num-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
            sc.close();
        }

    }
    
}
