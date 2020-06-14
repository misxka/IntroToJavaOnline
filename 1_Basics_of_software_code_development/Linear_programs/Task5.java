import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt((reader.readLine()));
        int hours = T / 3600;
        T %= 3600;
        int minutes = T / 60;
        T %= 60;
        int seconds = T;
        System.out.printf("%02dч %02dмин %02dс", hours, minutes, seconds);
    }
}
