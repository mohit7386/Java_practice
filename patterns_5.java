import java.util.*;
public class patterns_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of rows of stars you want to print:-");
        int num =sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num-1;j>=i;j--){

             System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");

            }
            System.out.println();
            sc.close();
        }

    }
    
}
