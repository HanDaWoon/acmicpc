import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * P11720
 */
public class P11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        System.out.println(Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).sum());
    }
}