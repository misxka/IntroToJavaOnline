import java.io.IOException;

public class Task8 {
    public static void main(String args[]) throws IOException {
        int array[] = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        int newSize = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != min) newSize++;
        }
        int newArray[] = new int[newSize];
        int i = 0;
        for(int element: array) {
            if(element != min) {
                newArray[i] = element;
                i++;
            }
        }
        for(int element: newArray) {
            System.out.println(element);
        }
    }
}
