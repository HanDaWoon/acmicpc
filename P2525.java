import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * P2525
 */
public class P2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tmp = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int A = tmp[0];
        int B = tmp[1];
        int C = Integer.parseInt(br.readLine());

        B += C;
        if (B >= 60) {
            A += B / 60;
            B %= 60;
        }
        if (A >= 24) {
            A %= 24;
        }
        System.out.println(A + " " + B);
    }
}