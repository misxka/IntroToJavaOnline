import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        int array[] = {12, -13, -14, -15, 0, -17, 0, 19, 20, 21};
        for(int i = 0; i < array.length; i++) {
            if(array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }
}
