import java.util.Scanner;
public class SpiralMatrix {
    static void print2Darray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );
        }

    }
    static void spiralmatrix(int [][] arr, int r, int c){
        int toprow=0, bottomrow=r-1, leftcol=0, rightcol=c-1;
        int totalE=0;
        while(totalE<r*c){
            // top row->leftcol to right col
            for(int j=leftcol;j<=rightcol && totalE<r*c;j++){
                System.out.print(arr[toprow][j]+" ,");
                totalE++;
            }
            toprow++;
            for(int i=toprow;i<=bottomrow && totalE<r*c;i++){
                System.out.print(arr[i][rightcol]+" ,");
                totalE++;
            }
            rightcol--;
            for(int j=rightcol;j>=leftcol && totalE<r*c;j--){
                System.out.print(arr[bottomrow][j]+" ,");
                totalE++;
            }
            bottomrow--;
            for(int i=bottomrow;i>=toprow && totalE<r*c ;i--){
                System.out.print(arr[i][leftcol]+" ,");
                totalE++;
            }
            leftcol++;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of row of first matrix: ");
        int r=sc.nextInt();
        System.out.println("Enter the length of column of first matrix: ");
        int c=sc.nextInt();
        int [][]a=new int[r][c];
        System.out.println("Enter the "+r*c+" elements of the first matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        print2Darray(a);
        System.out.println("Spiraled matrix: ");
        spiralmatrix(a,r,c);
    }
}

