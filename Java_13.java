import java.util.*;
public class Java_13 {
    public static void main(String[]args){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many Stars you want to Print:-");
        int num=sc.nextInt();
        for(i=1;i<=num;i++){
            System.out.println("* " +i);
            sc.close();
        }
    }
    
}
