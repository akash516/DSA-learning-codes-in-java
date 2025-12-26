import java.util.*;
public class ReversedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed array: ");
        for(int j=n-1; j>=0;j--){

                System.out.print(arr[j] + ", ");

        }
    }
}

