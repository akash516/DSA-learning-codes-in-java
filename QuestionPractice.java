import java.util.*;
public class QuestionPractice {
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
    static int[] Revere2Array(int [] arr, int i, int j){
        while(i<j){
            swapinArray( arr, i,  j);
            i++;
            j--;
        }
        int [] ans=arr;
        return ans;
    }
    static int [] rotation(int arr [], int k){
        int n= arr.length;
        k=k%n;
        int [] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;

    }
    static int [] rotationWithouextraSpace(int [] arr, int k){
        int n=arr.length;
        k=k%n;
        Revere2Array(arr, 0,n-k-1);
        Revere2Array(arr, n-k, n-1);
        Revere2Array(arr, 0,n-1);
        int ans[]=arr;
        return ans;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotation: ");
        int k=sc.nextInt();
        System.out.println("Original Array: ");
        printarray(arr);
        int [] arr1=rotationWithouextraSpace(arr, k);
        System.out.println("Rotated array : ");
        printarray(arr1);

    }
}
