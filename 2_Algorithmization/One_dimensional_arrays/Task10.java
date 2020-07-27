import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            n = Integer.parseInt(reader.readLine());
        } while(n < 1);
        int array[] = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = 2; i < n; i += 2) {
            array[i - 1] = 0;
            for(int j = i; j < n; j++) {
                int tmp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = tmp;
            }
            i--;
        }
        for(int element: array) {
            System.out.println(element);
        }
    }
}
