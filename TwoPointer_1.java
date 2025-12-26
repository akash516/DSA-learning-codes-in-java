import java.util.*;
public class TwoPointer_1 {
    static void printarray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    static void swapinArray(int [] arr, int i, int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
    static int[] Reverse2Array(int [] arr, int i, int j){
        while(i<j){
            swapinArray( arr, i,  j);
            i++;
            j--;
        }
        int [] ans=arr;
        return ans;
    }
    static void ZeroesandOnes(int [] arr){
        int n=arr.length;
        int zeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) {
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i< zeroes) {
                arr[i] = 0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    static void TwoP(int [] arr){
    int n=arr.length;
    int right=n-1;
    int left=0;
    while(left<right){
        if(arr[left]==1&& arr[right]==0){
            swapinArray(arr, left, right);
            left++;
            right--;
        }
        if(arr[right]==1){
            right--;
        }
        if(arr[left]==0){
            left++;
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n; i++){
            arr[i]=sc.nextInt();
        }
        TwoP(arr);
        System.out.println("Sorted 0's and 1's: ");
        printarray(arr);
    }
}
