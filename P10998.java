import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class P10998 {
    public static void main(String[] args) throws IOException {
        Stream.of(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
                .mapToInt((s) -> Integer.parseInt(s)).reduce((a, b) -> a * b).ifPresent(
                        System.out::println);
    }
}
