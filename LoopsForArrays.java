import java.util.*;
class  forloop {
    void demoArray() {
        int age[] = new int[3];
        age[0] = 15;
        age[1] = 10;
        age[2] = 25;
        for (int i = 0; i < 3; i++) {
            System.out.println(age[i]);

        }
    }

    void multiArray() {
        int[][] arr = {{56, 43, 6}, {34, 7, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j]);
        }
    }

    void sumofArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    void maxofArray(){
        int ans=0;
        int arr[]={5,2,8,9,10,1,3};
                for(int i=0; i<arr.length; i++)
                {
                    if(arr[i]>ans)
                        ans=arr[i];
                }
        System.out.println(ans);

    }
    void searchInArrayFirstOccurence(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to search:");
        int x=sc.nextInt();
        int ans=-1;
        int arr[]={7,2,8,9,1,3,4,5,6,2,0};
                for(int i=0;i<arr.length;i++)
                {
                    if(arr[i]==x) {
                        ans = i;
                        break;
                    }

                }
                if(ans==-1)
                {
                    System.out.println("Not found");
                }
                else {
                    System.out.println("Found " + x + " at index " + ans);
                }
    }
    void Frequency(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int x=sc.nextInt();
        System.out.println("Enter the lenght of array: ");
        int y=sc.nextInt();
        int ans=0;
        int arr[]=new int[y];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++)
        {
            Scanner ob=new Scanner(System.in);
            arr[i]=ob.nextInt();
        }
        for(int j=0; j< arr.length;j++)
        {
            if(arr[j]==x)
            {
                ans+=1;
            }
        }
        System.out.println("Frequency of "+x+" = "+ans);
    }
    void StrictlyGreater(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int x=sc.nextInt();
        System.out.println("Enter the lenght of array: ");
        int y=sc.nextInt();
        int ans=0;
        int arr[]=new int[y];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++)
        {
            Scanner ob=new Scanner(System.in);
            arr[i]=ob.nextInt();
        }
        for(int j=0; j< arr.length;j++)
        {
            if(arr[j]>=x)
            {
                ans+=1;
            }
        }
        System.out.println("Number of digits strictly greater than "+x+" = "+ans);
    }

}

public class LoopsForArrays{
    public static void main(String[] args) {
        forloop obj=new forloop();
        forloop obj1=new forloop();
        forloop obj2=new forloop();
        forloop obj3=new forloop();
        forloop obj4=new forloop();
        forloop obj5=new forloop();
        forloop obj6=new forloop();

        obj6.StrictlyGreater();
        //obj5.Frequency();;
        //obj4.searchInArrayFirstOccurence();
        //obj3.maxofArray();
        //obj1.demoArray();
        //obj2.multiArray();
        //obj.sumofArray();
    }
}