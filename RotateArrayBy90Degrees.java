import java.util.Scanner;

public class RotateArrayBy90Degrees {
    private static int n;

    static void print2Darray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );
        }

    }
    static int[][] transpose(int [][] matrix, int r, int c){
        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    static void reversearray(int[] arr){
        int i=0,j= arr.length-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    static void rotatematrix(int[][] arr, int n) {
        int [][] ans=transpose(arr,n,n);
        for(int i=0;i<n;i++){
            reversearray(ans[i]);
        }
        print2Darray(ans);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of row and columns of the matrix: ");
        int r=sc.nextInt();
        int [][]a=new int[r][r];
        System.out.println("Enter the "+r*r+" elements of the matrix to be transposed: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        print2Darray(a);
        System.out.println("Rotated matrix: ");
        rotatematrix(a,r);
    }
}


