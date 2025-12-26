import java.util.*;
public class MatrixMultiplication {
    static void print2Darray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );
        }

    }
    static void MultiplyMatrix(int[][] a, int r1,int c1, int [][]b, int r2, int c2){
        if(c1!=r2){
            System.out.println("Invalid Input- Multiplication is not possible ");
        }
        else {
            int multiplied[][] = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < r2; k++) {
                        multiplied[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            print2Darray(multiplied);
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
        MultiplyMatrix(a,r1,c1,b,r2,c2);
    }
}


