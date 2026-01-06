import java.util.*;
public class LinearSearch_MultipleOccurence{
   static ArrayList<Integer> allindices(int [] a, int target, int idx){
   if(idx>=a.length){
    return new ArrayList<Integer>();
   }
   ArrayList<Integer> ans=new ArrayList<>();
   if(a[idx]==target){
    ans.add(idx);
   }
   ArrayList<Integer> smallans=allindices(a, target,idx+1);
   ans.addAll(smallans);
   return ans;
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
        ArrayList<Integer> result=allindices(arr, target,0);
        System.out.println("The indices are: "+result);
        sc.close();
   }
}