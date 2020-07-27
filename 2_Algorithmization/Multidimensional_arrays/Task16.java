import java.io.IOException;

public class Task16 {
    public static void main(String[] args) throws IOException {
        int n = 3;
        int[][] matrix = new int[n][n];
        int element = 1;
        int x = n * 3 / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[(j - i + x) % n][(i * 2 - j + n) % n] = element++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
