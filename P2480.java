import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** * P2480 */
public class P2480 {
    public static void main(String[] args) throws IOException {
        Stream.of(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
                .mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted((a, b) -> {
                    if (a.getValue() == b.getValue()) {
                        return b.getKey() - a.getKey();
                    }
                    return (int) (b.getValue() - a.getValue());
                }).limit(1).forEach((e) -> {
                    if (e.getValue() == 3) {
                        System.out.println(10000 + e.getKey() * 1000);
                        return;
                    }
                    if (e.getValue() == 2) {
                        System.out.println(1000 + e.getKey() * 100);
                        return;
                    }
                    System.out.println(e.getKey() * 100);
                });
    }
}