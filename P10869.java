import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class P10869 {
    public static void main(String[] args) throws IOException {
        int[] tmp = Stream.of(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
                .mapToInt((s) -> Integer.parseInt(s)).toArray();
        System.out.println(tmp[0] + tmp[1]);
        System.out.println(tmp[0] - tmp[1]);
        System.out.println(tmp[0] * tmp[1]);
        System.out.println(tmp[0] / tmp[1]);
        System.out.println(tmp[0] % tmp[1]);
    }
}
