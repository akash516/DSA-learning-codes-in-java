import java.util.Scanner;

public class SumofPartofAMatrix {
    static void Row_Column_Sum(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    static int sumoflimits(int[][] arr, int l1, int r1, int l2, int r2) {
        int ans = 0;
        Row_Column_Sum(arr);
        int sum = 0, up = 0, left = 0, leftup = 0;
        sum = arr[l2][r2];
        if (r1 >= 1) {
            left = arr[l2][r1 - 1];
        }
        if (r1 >= 1 && l1 >= 1) {
            leftup = arr[l1 - 1][r1 - 1];
        }
        if (l1 >= 1) {
            up = arr[l1 - 1][r2];
        }
        ans = sum - up - left + leftup;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column length of the matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter " + r * c + " elements: ");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the the row and column coordinates to find the sum in the order (r1,r2,l1,l2):");
        int l1 = sc.nextInt();
        int r1= sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Required sum: " + sumoflimits(arr, l1, r1, l2, r2));
        sc.close();
    }
}

