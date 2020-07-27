import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        int k, p;
        do {
            k = Integer.parseInt(reader.readLine());
            p = Integer.parseInt(reader.readLine());
        } while(k > n || p > m);
        for (int i = 0; i < n; i++) {
            if(i == k - 1) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == p - 1) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}
