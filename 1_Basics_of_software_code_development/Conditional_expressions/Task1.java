import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int alpha = Integer.parseInt(reader.readLine());
        int beta = Integer.parseInt(reader.readLine());
        if(180 - (alpha + beta) > 0 && (alpha != 0 && beta != 0)) {
            System.out.println("Да, существует.");
            if(alpha == 90 || beta == 90 || (180 - (alpha + beta)) == 90) {
                System.out.println("Прямоугольный.");
            }
        }
        else System.out.println("Нет, не существует.");
    }
}
