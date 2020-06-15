import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m, n;
        do {
            m = Integer.parseInt(reader.readLine());
            n = Integer.parseInt(reader.readLine());
        } while(m < 1 || n < 1 || m == n);
        for(; m < n; m++) {
            System.out.print(m + ": ");
            for(int i = 2; i < m; i++) {
                if(m % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
