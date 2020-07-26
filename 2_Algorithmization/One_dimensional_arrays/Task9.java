import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        do {
            n = Integer.parseInt(reader.readLine());
        } while(n < 1);
        int array[] = new int[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int bigNumber = array[0];
        int bigAmount = 0;
        for(int i = 0; i < array.length; i++) {
            int number = array[i];
            int amount = 0;
            for(int j = 0; j < array.length; j++) {
                if(array[j] == number) amount++;
            }
            if(amount == bigAmount) {
                if(number < bigNumber) {
                    bigNumber = number;
                }
            }
            if(amount > bigAmount) {
                bigAmount = amount;
                bigNumber = number;
            }
        }
        System.out.println(bigNumber);
    }
}
