import java.util.*;

public class Java_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int a = sc.nextInt();
        System.out.println("Enter Second number:");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("First Number is Greater:- " + a);
        } else
            System.out.println("Second Number is Greater:- " + b);
        sc.close();
    }

}
