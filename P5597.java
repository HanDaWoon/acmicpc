import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * P5597
 */
public class P5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] ls = new int[30];

        for (int i = 0; i < 28; i++) {
            ls[Integer.parseInt(br.readLine()) - 1] = 1;
        }
        Arrays.stream(ls).boxed().forEach(withCounter((idx, item) -> {
            try {
                if (item == 0) {
                    bw.write((idx + 1) + "\n");
                }
            } catch (IOException e) {
            }
        }));
        bw.flush();
        bw.close();
    }

    private static <T> Consumer<T> withCounter(BiConsumer<Integer, T> consumer) {
        AtomicInteger counter = new AtomicInteger(0);
        return item -> consumer.accept(counter.getAndIncrement(), item);
    }
}