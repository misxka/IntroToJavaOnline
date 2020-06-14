import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        if((x < A && (y < B || z < B)) || (y < A && (x < B || z < B)) || (z < A && (x < B || y < B))) {
            System.out.println("Пройдёт");
        }
        else System.out.println("Не пройдёт");
    }
}
