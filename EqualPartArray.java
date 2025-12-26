import java.util.*;
public class EqualPartArray {
    static int ArraySum(int []arr){
        int total_sum=0;
        for(int i=0;i<arr.length;i++){
            total_sum+=arr[i];
        }
        return total_sum;
    }
    static boolean equalsumpartition(int []arr){
        int totalsum=ArraySum(arr);
        int prefsum=0;
        for(int i=0;i<arr.length;i++) {
            prefsum += arr[i];
            int suffsum = totalsum - prefsum;
            if (suffsum == prefsum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal partition possible: "+equalsumpartition(arr));
    }
}
