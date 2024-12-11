package daddy;
import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat1 = new int[r][c], mat2 = new int[r][c], res = new int[r][c];

        System.out.println("Enter elements of matrix1:");
        for (int i = 0; i < r; i++) 
            for (int j = 0; j < c; j++) mat1[i][j] = sc.nextInt();

        System.out.println("Enter elements of matrix2:");
        for (int i = 0; i < r; i++) 
            for (int j = 0; j < c; j++) mat2[i][j] = sc.nextInt();

        System.out.println("Sum of matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
