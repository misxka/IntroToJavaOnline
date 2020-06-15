import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

import static java.lang.Math.*;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal product = new BigDecimal("1");
        for(int i = 1; i <= 200; i++) {
            product = product.multiply(new BigDecimal(String.valueOf(pow(i, 2))));
        }
        System.out.println(product);
    }
}
