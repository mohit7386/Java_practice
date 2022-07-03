import java.util.*;

public class Java_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int M = sc.nextInt();
        if (M >= 90) {
            System.out.println("Grade A+ - Excellent");
        } else if (M >= 70) {
            System.out.println("Grade A - Well Done");

        } else if (M >= 60) {
            System.out.println("Grade B - Good");
        } else if (M >= 50) {
            System.out.println("Grade C - Fair (Need Hardwork)");
        } else {
            System.out.println("Grade D - Fail (Try Again)");
        }
        sc.close();

    }
}
