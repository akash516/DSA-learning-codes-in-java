import java.util.*;
public class Fibonacci_Series{
    static int fibo(int n){
        // base case
        if(n==0 || n==1){
            return n;
        }
        //subproblem + selfwork
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term of fibonacci series to be found: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci term at position "+n+" is: "+fibo(n));
        System.out.println("Fibonacci series till "+n+"th term= ");
        for(int j=0;j<=n;j++){
            System.out.print(fibo(j)+" ,");
        }
    }
}