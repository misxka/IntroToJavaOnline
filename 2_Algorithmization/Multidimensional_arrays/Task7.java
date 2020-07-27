import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class Task7 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            n = Integer.parseInt(reader.readLine());
        } while(n < 1);
        double[][] matrix = new double[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sin((i * i - j * j) / n);
            }
        }
        int positiveAmount = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] > 0) positiveAmount++;
            }
        }
        System.out.println(positiveAmount);
    }
}
