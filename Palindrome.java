import java.util.*;
public class Palindrome {
    static boolean ispalindrome(int x){
        int original=x;
        if(x<0){
            return false;
        }
        int rev=0;
        while(x>0){
            int count=x%10;
            rev=rev*10+count;
            x/=10;
        }
        if(rev==original){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int x=sc.nextInt();
        System.out.println(ispalindrome(x));
    }
}
