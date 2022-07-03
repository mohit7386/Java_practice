import java.util.*;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Alphabets:");
        char ch = sc.next().charAt(0);
        int num = ch;
        System.out.println("Ascii Value of given character " + ch + " is = " + num);
        sc.close();

    }

}
