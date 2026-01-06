import java.util.*;

public class LinearSearch {
    static boolean Search(int arr[], int idx, int target) {
        // base case
        if (idx >= arr.length)
            return false;

        // self work
        if (arr[idx] == target)
            return true;
        // recursive call
        return Search(arr, idx + 1, target);
    }
    static int Search_Index(int arr[], int idx, int target) {
        // base case
        if (idx >= arr.length)
            return -1;

        // self work
        if (arr[idx] == target)
            return idx+1;
        // recursive call
        return Search_Index(arr, idx + 1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int idx = sc.nextInt();
        int arr[] = new int[idx];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < idx; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        boolean result = Search(arr, 0, target);
        if(result==true)
            System.out.println("Element found in the array");
        else
            System.out.println("Element not found in the array");
        int resultIndex = Search_Index(arr, 0, target);
        if(resultIndex!=-1)
             System.out.println("Element found at Index: "+resultIndex);
    }
}