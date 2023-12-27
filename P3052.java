import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * P3052
 */
public class P3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ls = new int[10];

        for (int i = 0; i < 10; i++) {
            ls[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(Arrays.stream(ls).map(i -> i % 42).distinct().count());
    }
}