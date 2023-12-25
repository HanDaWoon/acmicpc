import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * P2884
 */
public class P2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] tmp = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int H = tmp[0];
        int M = tmp[1];

        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
            return;
        }
        System.out.println(H + " " + (M - 45));
    }
}