import java.util.*;
public class Smallest_2nd {
    static int FirstSmoll(int[] arr){
        int n=arr.length;
        int mx=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int SecondSmoll(int[] arr){
        int mx=FirstSmoll(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int SecondSmoll=FirstSmoll(arr);
        return SecondSmoll;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second smallest number of the given data= "+SecondSmoll(arr));
        sc.close();
    }
}
