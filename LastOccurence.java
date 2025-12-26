import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the number to search:");
            int x=sc.nextInt();
            System.out.println("Enter the length of array: ");
            int y=sc.nextInt();
            int ans=-1;
            int j=0;
            int arr[]=new int[y];
            System.out.println("Enter array elements:");
            for(int i = 0; i<arr.length; i++)
            {
                Scanner ob=new Scanner(System.in);
                arr[i]=ob.nextInt();
            }
            for(j=0;j<arr.length;j++)
            {
                if(arr[j]==x) {
                    ans = j;
                }
            }
            System.out.println("Last occurence of "+x+ " is in index " +ans);
        }
    }

