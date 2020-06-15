import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        while(m > 0) {
            int digitM = m % 10;
            m /= 10;
            int tempN = n;
            while(tempN > 0) {
                int digitN = tempN % 10;
                tempN /= 10;
                if(digitM == digitN) {
                    System.out.println(digitM);
                    break;
                }
            }
        }
    }
}
