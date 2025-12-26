import java.util.*;
public class SumAndCountOfDigits_Recursion {
     static int  SOD(int n){
         if(n>=0 && n<=9){
             return n;
         }
         return SOD(n/10)+n%10;
     }
     static int COD(int n){
         if(n>=0 && n<=9){
             return 1;
         }
         return 1+COD(n/10);
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Sum of digits= "+ SOD(n));
        System.out.println("Count of digits= "+ COD(n));
        sc.close();
    }
}
