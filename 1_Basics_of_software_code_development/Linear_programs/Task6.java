import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt((reader.readLine()));
        int y = Integer.parseInt(reader.readLine());
        System.out.println(((x >= -2 && x <= 2) && (y >= -3 && y <= 4)) ? true :
                ((x >= -4 && x <= 4) && (y >= -3 && y <= 0)));
    }
}
