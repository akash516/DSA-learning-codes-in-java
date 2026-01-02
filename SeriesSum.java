import java.util.*;
public class SeriesSum{
    static int seriessum1(int n){
       if(n==0) return 0;
       return seriessum1(n-1)+n; 
    }
    static int seriessum2(int n){
        if(n==0) return 0;
        if(n%2==0){//even
            return seriessum2(n-1)-n;
        }
        else{
            return seriessum2(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.printf("Sum of series= ");
        System.out.println(seriessum1(n));
        System.out.println("Sum of even odd series="+ seriessum2(n));
        sc.close();
    }
}