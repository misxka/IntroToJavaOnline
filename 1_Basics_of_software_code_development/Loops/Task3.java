import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += pow(i, 2);
        }
        System.out.println(sum);
    }
}
