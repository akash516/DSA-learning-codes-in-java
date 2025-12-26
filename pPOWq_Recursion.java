import java.util.*;
public class pPOWq_Recursion {
    static int power(int p, int q) {
        if (q == 0)
            return 1;
        return power(p, q - 1) * p; //p^(q-1)*p=p^q
    }
    //Alternate Approach
    static int power_1(int p, int q){
        if(q==0)
            return 1;
        int smallpow=power_1(p,q/2);
        if(q%2==0)
            return smallpow*smallpow;

        else
            return smallpow*smallpow*p;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base: ");
        int p=sc.nextInt();
        System.out.println("Enter the power: ");
        int q=sc.nextInt();
        System.out.println("Answer: "+power(p,q));
        System.out.println("Answer: "+power_1(p,q));
    }
}
