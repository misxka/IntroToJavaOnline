import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String args[]) throws IOException {
        double array[] = {12.1, 13.2, 14.3, 15.4, 16.5, 17.6, 18.7, 19.8, 20.9, 21.12};
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        double z = Double.parseDouble(reader.readLine());
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > z) {
                array[i] = z;
                sum++;
            }
        }
        for(double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Number of changes: " + sum);
    }
}
