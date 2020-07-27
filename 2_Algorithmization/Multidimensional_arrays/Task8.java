import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            n = Integer.parseInt(reader.readLine());
        } while (n < 1);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        int k, p;
        do {
            k = Integer.parseInt(reader.readLine());
            p = Integer.parseInt(reader.readLine());
        } while (k > n || k < 1 || p > n || p < 1);
        for (int j = 0; j < n; j++) {
            if (j == k - 1) {
                for (int i = 0; i < n; i++) {
                    int tmp = matrix[i][k - 1];
                    matrix[i][k - 1] = matrix[i][p - 1];
                    matrix[i][p - 1] = tmp;
                }
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
