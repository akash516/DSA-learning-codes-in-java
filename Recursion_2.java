import java.util.*;
public class Recursion_2 {
         static int Factorial(int n) {
             if (n == 0) {
                 return 1;
             }
             return n*Factorial(n-1);
         }
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            System.out.println("Factorial= "+ Factorial(x));
         }
}

