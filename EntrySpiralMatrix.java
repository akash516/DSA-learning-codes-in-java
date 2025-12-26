import java.util.Scanner;
public class EntrySpiralMatrix {
    static void print2Darray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );
        }

    }
    static int [][] generatespiralmatrix(int n){
        int toprow=0, bottomrow=n-1, leftcol=0, rightcol=n-1;
        int arr[][]=new int[n][n];
        int curr=1;
        while(curr <= n*n){
            // top row
            for(int j=leftcol;j<=rightcol;j++){
                arr[toprow][j]=curr++;
            }
            toprow++;
            // right column
            for(int i=toprow;i<=bottomrow;i++){
                arr[i][rightcol]=curr++;
            }
            rightcol--;
            // bottom row
            for(int j=rightcol;j>=leftcol;j--){
                arr[bottomrow][j]=curr++;
            }
            bottomrow--;
            // left column
            for(int i=bottomrow;i>=toprow;i--){
                arr[i][leftcol]=curr++;
            }
            leftcol++;
        }
        return arr;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of row and column of the square matrix: ");
        int n=sc.nextInt();
        int[][] matrix= generatespiralmatrix(n);
        print2Darray(matrix);
    }
}



