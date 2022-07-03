import java.util.*;
public class patterns_7 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char x='A';
        System.out.println("How many rows of counting you want to print:-");
        char ch=sc.next().charAt(0);
        for (char i='A';i<=ch;i++){
            for(char j='A';j<=ch;j++){
                System.out.printf("%c",x++);
            }
            System.out.println();
            sc.close();
        }

    }
    
}

    

