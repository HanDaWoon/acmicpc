import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * P10807
 */
public class P10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        IntStream ls = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt);
        int V = Integer.parseInt(br.readLine());
        System.out.println(ls.filter(item -> item == V).count());
    }
}