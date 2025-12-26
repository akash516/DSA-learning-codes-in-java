import java.util.Scanner;
public class LeetcodeBank {
    static int bank(int n){
        int x=n/7;
        int y=x+1;
        int rem=n%7;
        int remSum=0;
        int sum=x*(2*28+(x-1)*7)/2;
        while(rem>0){
            remSum+=y;
            y++;
            rem--;
        }
        int total=sum+remSum;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(bank(n));
    }
}
