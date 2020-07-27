import java.io.IOException;

public class Task13 {
    public static void main(String args[]) throws IOException {
        int n = 5, m = 5;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
        for(int j = 0; j < m; j++) {
            for(int i = 0; i < n; i++) {
                for (int k = n - 1; k > i; k--) {
                    if(matrix[k][j] < matrix[k - 1][j]) {
                        int tmp = matrix[k - 1][j];
                        matrix[k - 1][j] = matrix[k][j];
                        matrix[k][j] = tmp;
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
        for(int j = 0; j < m; j++) {
            for(int i = 0; i < n; i++) {
                for (int k = n - 1; k > i; k--) {
                    if(matrix[k][j] > matrix[k - 1][j]) {
                        int tmp = matrix[k - 1][j];
                        matrix[k - 1][j] = matrix[k][j];
                        matrix[k][j] = tmp;
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
