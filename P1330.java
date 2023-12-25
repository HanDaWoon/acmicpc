import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * P1330
 */
public class P1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tmp = Stream.of(br.readLine().split(" ")).mapToInt((s) -> Integer.parseInt(s)).toArray();
        if (tmp[0] == tmp[1]) {
            System.out.println("==");
            return;

        }
        if (tmp[0] > tmp[1]) {
            System.out.println(">");
            return;
        }
        System.out.println("<");
    }
}