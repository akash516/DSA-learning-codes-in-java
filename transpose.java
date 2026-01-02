import java.util.*;
public class transpose {
    static void print2Darray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );
        }

    }
    static void transpose(int [][] matrix, int r, int c){
        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        print2Darray(ans);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of row of the matrix: ");
        int r=sc.nextInt();
        System.out.println("Enter the length of column of the matrix: ");
        int c=sc.nextInt();
        int [][]a=new int[r][c];
        System.out.println("Enter the "+r*c+" elements of the matrix to be transposed: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        print2Darray(a);
        System.out.println("Transposed matrix: ");
        transpose(a,r,c);
        sc.close();
    }
}
