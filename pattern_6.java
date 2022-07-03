import java.util.*;
public class pattern_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows you want to print:-");
        char ch=sc.next().charAt(0);
        for(char i='A';i<=ch;i++){
            for(char j='A';j<=ch;j++){
                System.out.print(j);
                sc.close();
            }
                System.out.println();
        }
    }
    
}
