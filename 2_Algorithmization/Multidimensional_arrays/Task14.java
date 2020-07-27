import java.io.IOException;

public class Task14 {
    public static void main(String[] args) throws IOException {
        int n = 5, m = 5;
        int[][] matrix = new int[n][m];
        for (int j = 0; j < m; j++) {
            int counter = 0;
            for (int i = 0; i < n; i++) {
                if(j != m - 1) {
                    if(counter < j + 1) {
                        matrix[i][j] = (int) (Math.random() * 2);
                    }
                    if(matrix[i][j] == 1) counter++;
                    if(counter < j + 1 && i > n - (j + 1)) {
                        matrix[i][j] = 1;
                    }
                }
                else {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
