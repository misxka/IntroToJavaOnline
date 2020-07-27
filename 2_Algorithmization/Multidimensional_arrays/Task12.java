import java.io.IOException;

public class Task12 {
    public static void main(String args[]) throws IOException {
        int n = 5, m = 5;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for (int k = m - 1; k > j; k--) {
                    if(matrix[i][k] < matrix[i][k - 1]) {
                        int tmp = matrix[i][k - 1];
                        matrix[i][k - 1] = matrix[i][k];
                        matrix[i][k] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for (int k = m - 1; k > j; k--) {
                    if(matrix[i][k] > matrix[i][k - 1]) {
                        int tmp = matrix[i][k - 1];
                        matrix[i][k - 1] = matrix[i][k];
                        matrix[i][k] = tmp;
                    }
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
