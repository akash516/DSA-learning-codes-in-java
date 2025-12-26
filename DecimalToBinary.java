import javax.swing.*;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your decimal number:");
        int n = sc.nextInt();
        int p = 1;
        int ans = 0;
          while (n > 0) {
                int d = n % 2;

                ans += (d * p);
                n /= 2;
                p *=10;
            }
            System.out.println(ans);
        }
    }

