import java.util.*;
public class patterns_6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many rows of counting you want to print:-");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            for(int j=num-1;j>=i;j--){
                System.out.printf("*");
            
            }
            System.out.println();
            sc.close();
        }

    }
    
}
