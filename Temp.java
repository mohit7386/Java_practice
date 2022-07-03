import java.util.*;
public class Temp {
    public static void main(String []args){
        float fahrenhiet;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in Celcius:-");
        float temp=sc.nextFloat();
        fahrenhiet=temp*9/5+32;
        System.out.println("The temperature in celcius is "  +fahrenhiet);
        sc.close();
    }

}
