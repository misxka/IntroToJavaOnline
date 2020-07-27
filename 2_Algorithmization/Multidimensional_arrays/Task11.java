import java.io.IOException;

public class Task11 {
    public static void main(String args[]) throws IOException {
        int n = 10, m = 20;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 5) sum++;
            }
            if(sum >= 3) System.out.println(i);
        }
    }
}
