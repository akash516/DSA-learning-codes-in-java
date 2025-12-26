import java.util.*;
public class RunningSum {
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
        int [] arr=new int[n];
        System.out.println("Enter "+n+" array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Running(arr);
        printarray(arr);
    }
}
