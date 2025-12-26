import javax.swing.*;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your binary number:");
        int n = sc.nextInt();
        int p = 1;
        int ans = 0;
        if (n % 10 == 1 || n % 10 == 0) {
            while (n > 0) {
                int d = n % 10;

                ans += (d * p);
                n /= 10;
                p *= 2;
            }
            System.out.println(ans);
        }
        else
            System.out.println("not binary");

    }
}

