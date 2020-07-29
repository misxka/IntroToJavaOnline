import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int[] array1 = new int[n];
        int[] array2 = new int[m];
        for (int i = 0; i < n; i++) {
            array1[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < m; i++) {
            array2[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i ; j--) {
                if(array1[j - 1] > array1[j]) {
                    int tmp = array1[j - 1];
                    array1[j - 1] = array1[j];
                    array1[j] = tmp;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = m - 1; j > i ; j--) {
                if(array2[j - 1] > array2[j]) {
                    int tmp = array2[j - 1];
                    array2[j - 1] = array2[j];
                    array2[j] = tmp;
                }
            }
        }
        int[] array3 = new int[n + m];
        int i = 0, j = 0, k = 0;
        while(i < n || j < m) {
            if(i == n) {
                array3[k++] = array2[j++];
            }
            else if(j == m) {
                array3[k++] = array1[i++];
            }
            else if(array1[i] < array2[j]) {
                array3[k++] = array1[i++];
            }
            else array3[k++] = array2[j++];
        }
        for (int l = 0; l < array3.length; l++) {
            System.out.print(array3[l] + " ");
        }
    }
}
