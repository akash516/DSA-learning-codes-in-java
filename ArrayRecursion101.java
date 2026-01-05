import java.util.*;
public class ArrayRecursion101{
    static void printarr(int [] arr, int idx){
        if(arr.length==idx){// base case
            return;
        }
       System.out.print(arr[idx]+", ");
       printarr(arr,idx+1);
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
    sc.close();
    }
}