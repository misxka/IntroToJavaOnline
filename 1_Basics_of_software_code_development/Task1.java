import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x;
        do {
            x = Integer.parseInt(reader.readLine());
        } while(x < 1);
        int sum = 0;
        for(int i = 1; i < x; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
