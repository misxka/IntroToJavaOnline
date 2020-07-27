import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j && matrix[i][j] > 0) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}
