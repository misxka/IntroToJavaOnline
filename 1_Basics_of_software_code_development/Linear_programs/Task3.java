import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        double y = Double.parseDouble(reader.readLine());
        double z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        System.out.println(z);
    }
}
