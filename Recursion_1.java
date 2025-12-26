import java.util.*;
public class Recursion_1 {
    static void PD(int n) {// n, n-1, n-2,......2,1
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PD(n-1);
    }


    static void PI(int n) {//1,2,3....,(n-1),n
        if(n==1) {
            System.out.println(n);
            return;
        }
        PI(n-1); // 1,2,3.....,(n-1)
        System.out.println(n);
    }
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            PI(n);
            PD(n);
        }
    }

