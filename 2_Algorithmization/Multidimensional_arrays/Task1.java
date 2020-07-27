import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        for(int i = 0; i < m; i += 2) {
            if(matrix[0][i] > matrix[n - 1][i]) {
                System.out.println("Столбец " + (i+1) + ":");
                for (int j = 0; j < n; j++) {
                    System.out.println(matrix[j][i]);
                }
            }
        }
    }
}
