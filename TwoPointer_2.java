import java.util.*;
public class TwoPointer_2 {
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

    static void sortevenodd(int [] arr){
        int right=arr.length-1;
        int left=0;
        while(left< right){
            if(left%2==1 && right%2==0){
                swapinArray(arr, right , left);
                left++;
                right--;
            }
            if(left%2==0){
                left++;
            }
            if(right%2==1){
                right--;
            }
        }
    }
    static int[] sortSquare(int[] arr){
        int n=arr.length;
        int left=0, right=n-1;
        int [] ans=new int[n];
        int k=n-1;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                k--;
                left++;
            }
            else{
                ans[k]=arr[right]*arr[right];
                k--;
                right--;
            }
        }
        return ans;
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
        //sortevenodd(arr);
        System.out.println("Original sorted array: ");
        printarray(arr);
        int ans[]= sortSquare(arr);
        System.out.println("Squared: ");
       printarray(ans);
    }
}
