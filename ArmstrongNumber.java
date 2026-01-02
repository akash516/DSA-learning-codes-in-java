import java.util.*;
public class ArmstrongNumber{
    static int isArmstrong(int n){//using recursion
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int rem=n%10;
        int armstrong=isArmstrong(n/10)+(rem*rem*rem); 
        return armstrong; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int n=sc.nextInt();
        System.out.println("Armstrong number calculation for the number= "+isArmstrong(n));
        if(isArmstrong(n)==n){
            System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }
        sc.close();
    }
}