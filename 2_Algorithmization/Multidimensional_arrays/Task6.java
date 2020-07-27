import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            n = Integer.parseInt(reader.readLine());
        } while(n % 2 != 0);
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i < n / 2) {
                    if (j > n - i - 1 || j < i) {
                        matrix[i][j] = 0;
                    } else {
                        matrix[i][j] = 1;
                    }
                } else {
                    if (j < n - i - 1 || j > i) {
                        matrix[i][j] = 0;
                    } else {
                        matrix[i][j] = 1;
                    }
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
