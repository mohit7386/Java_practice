import java.util.*;

public class java_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet");
        char ch = sc.next().charAt(0);
        int num = ch;
        if (num >= 97 && num <= 122) {
            System.out.println("Lowercase " + num);
        } else {
            System.out.println("UpperCase");
            sc.close();
        }
    }

}
