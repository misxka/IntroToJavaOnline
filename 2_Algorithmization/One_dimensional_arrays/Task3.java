import java.io.IOException;

public class Task3 {
    public static void main(String args[]) throws IOException {
        double array[] = {12.1, -13.2, -14.3, -15.4, 0, -17.6, 0, 19.8, 20.9, 21.12};
        int positiveSum = 0, negativeSum = 0, nullSum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                positiveSum++;
            }
            else if(array[i] == 0) {
                nullSum++;
            }
            else negativeSum++;
        }
        System.out.println("Positive " + positiveSum);
        System.out.println("Nulls " + nullSum);
        System.out.println("Negative " + negativeSum);
    }
}
