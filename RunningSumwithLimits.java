import java.util.*;
public class RunningSumwithLimits {

    static void printarray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    static int[] Running(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("Enter "+n+" array elements: ");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int [] Psum=Running(arr);
        System.out.println("Prefix sum of the given array: ");
        printarray(Psum);
        System.out.println("Enter the number of queries: ");
        int q=sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter the index to start prefix sum from( Index starts from 1)");
            int l = sc.nextInt();
            System.out.println("Enter the index to end prefix sum at");
            int r = sc.nextInt();
            int ans= Psum[r]-Psum[l-1];
            System.out.println("Answer: " +ans);
        }
    }
}


