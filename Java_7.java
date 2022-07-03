import java.util.*;

public class Java_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        int l = sc.nextInt();
        System.out.println("Enter Breadth of Rectangle");
        int b = sc.nextInt();
        if (l == b) {
            System.out.println("This is Square");
        } else {
            System.out.println("This is Rectangle");
        }
        int area = l * b;
        System.out.println("The area of Rectangle is:- " + area);
        sc.close();

    }

}
