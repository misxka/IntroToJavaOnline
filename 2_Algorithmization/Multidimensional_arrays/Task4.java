import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            n = Integer.parseInt(reader.readLine());
        } while(n % 2 != 0);
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            if(i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = n - j;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = j + 1;
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
