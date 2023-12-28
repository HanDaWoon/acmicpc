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
 * P10809
 */
public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        Arrays.stream(br.readLine().split(""))
                .forEach(withCounter((idx, alphabet) -> {
                    int curIdx = alphabet.charAt(0) - 'a';
                    if (alphabets[curIdx] == -1) {
                        alphabets[curIdx] = idx;
                    }
                }));
        Arrays.stream(alphabets).forEach(alphabet -> {
            try {
                bw.write(alphabet + " ");
            } catch (IOException e) { }
        });
        bw.newLine();
        bw.flush();
        bw.close();
    }

    private static <T> Consumer<T> withCounter(BiConsumer<Integer, T> consumer) {
        AtomicInteger counter = new AtomicInteger(0);
        return item -> consumer.accept(counter.getAndIncrement(), item);
    }
}