import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x, y;
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int h = Integer.parseInt(reader.readLine());
        for(x = a; x <= b; x += h) {
            if(x > 2) {
                y = x;
            }
            else {
                y = -x;
            }
            System.out.println("y(" + x + ") = " + y);
        }
    }
}
