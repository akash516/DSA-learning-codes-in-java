import java.util.*;
public class SeriesSum{
    static int seriessum1(int n){
       if(n==0) return 0;
       return seriessum1(n-1)+n; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.printf("Sum of series= ");
        System.out.println(seriessum1(n));
        sc.close();
    }
}