import java.util.*;
public class Xpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int r=sc.nextInt();
        System.out.println("Enter columns");
        int c=sc.nextInt();
        for(int i=1; i<=r;i++)
        {
            for(int j=1;j<=c;j++)
                if(i==j || i+j==(((r+c)/2)+1) ) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            System.out.println();
        }
    }
}


