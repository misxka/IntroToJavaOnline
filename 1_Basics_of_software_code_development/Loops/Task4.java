import java.math.BigDecimal;

import static java.lang.Math.*;

public class Task4 {
    public static void main(String[] args) {
        BigDecimal product = new BigDecimal("1");
        for(int i = 1; i <= 200; i++) {
            product = product.multiply(new BigDecimal(String.valueOf(pow(i, 2))));
        }
        System.out.println(product);
    }
}
