import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        int array[] = {12, 55, 32, 7, 54, 29, 28, 14, 15, 91};
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        int k = Integer.parseInt(reader.readLine());
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
