package 사칙연산;
import java.util.Scanner;

public class AminusB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a-b);

        sc.close();
    }
}
