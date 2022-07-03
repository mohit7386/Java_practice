import java.util.*;
public class java_17 {
    public static void main(String[]args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            if(i%3==0)
        
              count=count+1; 
        }
             System.out.println("Total Multiples of 3 in " +num+  " is "+count);
            sc.close();
        
        }
    }

    
