import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 3, 5, 5, 7, 9};
        for (int i = 0; i < array.length; i++) {
            int k = i;
            int tmp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if(tmp <= array[j]) {
                    k = j;
                    tmp = array[j];
                }
            }
            array[k] = array[i];
            array[i] = tmp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
