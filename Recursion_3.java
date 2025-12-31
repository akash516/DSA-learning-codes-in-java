import java.util.*;
 public class Recursion_3 {
     static void fx(int n, int k){
         if(k==0) return;
         fx(n,k-1);
         System.out.println(n*k);
     }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of table to be found: ");
         int n=sc.nextInt();
         System.out.println("Upto the term the table is to be found: ");
         int k= sc.nextInt();
        fx(n,k);
     }
 }

