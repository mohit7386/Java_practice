import java.util.*;
public class pattern_8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        for(char i='A';i<=ch;i++){
            for(char j=(char) (ch-1);j>=i;j--){
                System.out.print(" ");
            }
                for(char k='A';k<=i;k++){
                    System.out.print(k);
                }
                System.out.println();
                sc.close();
            }
        }
    }
