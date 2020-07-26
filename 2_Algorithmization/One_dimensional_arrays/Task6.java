import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        double array[] = {12.1, 13.2, 14.3, 15.4, 16.5, 17.6, 18.7, 19.8, 20.9, 21.12};
        double sum = 0;
        for(int i = 2; i <= array.length; i++) {
            int counter = 0;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    counter++;
                }
            }
            if(counter == 0) sum += array[i - 1];
        }
        System.out.println(sum);
    }
}
