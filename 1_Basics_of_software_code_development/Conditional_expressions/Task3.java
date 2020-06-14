import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        int y1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int y2 = Integer.parseInt(reader.readLine());
        int x3 = Integer.parseInt(reader.readLine());
        int y3 = Integer.parseInt(reader.readLine());
        if((y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1)) {
            System.out.println("Расположены на одной прямой");
        }
        else System.out.println("Не расположены на одной прямой");
    }
}
