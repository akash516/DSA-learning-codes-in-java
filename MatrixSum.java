import java.util.*;
public class MatrixSum {
    static void print2Darray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );
        }

    }
    static void Matsum(int r1, int c1, int [][] a, int [][] b, int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Invalid Input- Addition not possible");
            return;
        }
        else{
            int [][] sum=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    sum[i][j]=a[i][j]+b[i][j];
                }
            }
           print2Darray(sum);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of row of first matrix: ");
        int r1=sc.nextInt();
        System.out.println("Enter the length of column of first matrix: ");
        int c1=sc.nextInt();
        int [][]a=new int[r1][c1];
        System.out.println("Enter the "+r1*c1+" elements of the first matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the length of row of second matrix: ");
        int r2=sc.nextInt();
        System.out.println("Enter the length of column of second matrix: ");
        int c2=sc.nextInt();
        int [][]b=new int[r2][c2];
        System.out.println("Enter the "+r2*c2+" elements of the second matrix: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("First Matrix: ");
        print2Darray(a);
        System.out.println("Second Matrix: ");
        print2Darray(b);
        System.out.println("Final answer: ");
        Matsum(r1,c1,a,b,r2,c2);
    }
}
