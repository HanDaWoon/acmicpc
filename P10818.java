import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * P10818
 */
public class P10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] ls = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        System.out.println(ls[0] + " " + ls[ls.length - 1]);
    }
}