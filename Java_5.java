import java.util.Scanner;

public class Java_5 {
   public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String a = sc.next();
        System.out.println("Enter Second String");
        String b = sc.next();
        System.out.println(a + b);
        sc.close();
    }

}
