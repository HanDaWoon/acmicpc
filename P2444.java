import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.IntStream;

/**
 * P2444
 */
public class P2444 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        IntStream.rangeClosed(1, (N * 2) - 1).forEach(i -> {
            try {
                if (i <= N) {
                    bw.write(" ".repeat(N - i));
                    bw.write("*".repeat((i * 2) - 1));
                    bw.newLine();
                    return;
                }
                bw.write(" ".repeat(i - N));
                bw.write("*".repeat(((N * 2) - i) * 2 - 1));
                bw.newLine();
            } catch (IOException e) { }
        });
        bw.flush();
        bw.close();
    }
}