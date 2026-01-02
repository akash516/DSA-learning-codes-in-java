import java.util.*;
public class GCD{
    //brute force approach
    static int GCDBF(int a, int b){
        int gcd=1;
        if(a==0 || b==0){
            return 0;
        }
        for(int i=1; i<Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
}
static int GCDOptimal(int x, int y){// long division method
   while(x%y!=0){
    int rem=x%y;
    x=y;
    y=rem;
   }
   return y;
}
static int GCDRecursive(int x, int y){//Euclid's algorithm
    if(y==0){
        return x;
    }
    return GCDRecursive(y, x%y);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is: "+GCDBF(a,b));
        System.out.println("GCD of "+a+" and "+b+" is: "+GCDOptimal(a,b));
        System.out.println("GCD of "+a+" and "+b+" is: "+GCDRecursive(a,b));
        sc.close();
    }
}