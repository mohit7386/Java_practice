import java.util.*;
public class patterns_4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many rows you want to print:-");
        int num =sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=i;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
    
}
