import java.util.*;
public class ArrayRecursion_101{
    static void printarr(int [] arr, int idx){
        if(arr.length==idx){// base case
            return;
        }
       System.out.print(arr[idx]+", ");
       printarr(arr,idx+1);
    }
    static int Max_Recursion(int [] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallans=Max_Recursion(arr, idx+1);
      return Math.max(smallans,arr[idx]);
   }
   static int Min_Recursion(int [] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallans=Min_Recursion(arr, idx+1);
      return Math.min(smallans,arr[idx]);
   }
   static int Sum_Recursion(int [] arr, int idx) {
       if(idx==arr.length-1){
        return arr[idx];
       }
       return arr[idx]+Sum_Recursion(arr, idx+1);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int idx=sc.nextInt();
        System.out.println("Enter "+idx+" number of elements: ");
        int arr[]=new int[idx];
        for(int i=0;i<idx;i++){
            arr[i]=sc.nextInt();
        }
    printarr(arr,0);
    System.out.println("Maximum value:"+Max_Recursion(arr, 0));
    System.out.println("Minimum value:"+Min_Recursion(arr, 0));
    System.out.println("Sum of all elements: "+Sum_Recursion(arr, 0));
    sc.close();
    }
}