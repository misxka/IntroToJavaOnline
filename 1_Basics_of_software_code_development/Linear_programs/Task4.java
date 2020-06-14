import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double R = Double.parseDouble(reader.readLine());
        int temp1 = (int) R;
        int temp2 = (int) (R % 1 * 1000);
        R = temp2 + temp1 / 1000.0;
        System.out.println(R);
    }
}
