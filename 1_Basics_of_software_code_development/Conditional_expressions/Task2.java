import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int min1, min2, max;
        if(a <= b)
            min1 = a;
        else min1 = b;
        if(c <= d)
            min2 = c;
        else min2 = d;
        if(min1 >= min2) max = min1;
        else max = min2;
        System.out.println(max);
    }
}
