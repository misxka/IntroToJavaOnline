import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        double F;
        if(x <= 3) {
            F = pow(x, 2) - 3 * x + 9;
        }
        else F = 1 / (pow(x, 3) + 6);
        System.out.println(F);
    }
}
