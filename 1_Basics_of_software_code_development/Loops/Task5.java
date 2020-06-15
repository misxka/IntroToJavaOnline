import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double e;
        do {
            e = Double.parseDouble(reader.readLine());
        } while (e <= 0);
        double sum = 0;
        int n = 1;
        for(n = 1;; n++) {
            double a = (1 / pow(2, n)) + (1 / pow(3, n));
            if(abs(a) >= e) {
                sum += a;
            }
            else break;
        }
        System.out.println(sum);
    }
}
