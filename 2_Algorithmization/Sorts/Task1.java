import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size1, size2;
        do {
            size1 = Integer.parseInt(reader.readLine());
            size2 = Integer.parseInt(reader.readLine());
        } while(size1 < 1 || size2 < 1 || size1 == size2);
        int k;
        do {
            k = Integer.parseInt(reader.readLine());
        } while(k < 1 || k > size1 - 1);
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            array1[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < size2; i++) {
            array2[i] = (int) (Math.random() * 100);
        }
        int[] array3 = new int[size1 + size2];
        int j = 0;
        for (int i = 0; i < array3.length; i++) {
            if(i < k) {
                array3[i] = array1[i];
            }
            else if(i >= k + size2) {
                array3[i] = array1[k++];
            }
            else {
                array3[i] = array2[j++];
            }
        }
        for (int i = 0; i < size1; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size2; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
    }
}
