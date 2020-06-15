import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += pow(i, 2);
        }
        System.out.println(sum);
    }
}
