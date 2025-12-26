import java.util.*;
public class QueryProblem1 {
    static int[] makefrequencyarray(int [] arr){
        int freq[]=new int[10005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[]freq= makefrequencyarray(arr);
        System.out.println("Enter the number of queries: ");
        int q=sc.nextInt();

        while(q>0){
            System.out.println("Enter the number to be searched: ");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println(x+" is present "+freq[x]+" number of times");
            }
            else{
                System.out.println("Entered number is not present");
            }
            q--;
        }
    }
}
