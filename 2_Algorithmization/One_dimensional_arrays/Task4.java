import java.io.IOException;

public class Task4 {
    public static void main(String args[]) throws IOException {
        double array[] = {12.1, -13.2, -14.3, -15.4, 0, -17.6, 0, 19.8, 20.9, 21.12};
        double max = array[0];
        double min = array[0];
        int maxPosition = 0;
        int minPosition = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxPosition = i;
            }
            if(array[i] < min) {
                min = array[i];
                minPosition = i;
            }
        }
        double tmp = array[minPosition];
        array[minPosition] = array[maxPosition];
        array[maxPosition] = tmp;
        for(double element: array) {
            System.out.print(element + " ");
        }
    }
}
