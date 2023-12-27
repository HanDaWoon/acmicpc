import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

/**
 * P10871
 */
public class P10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine().split(" ")[1]);
        Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).filter(item -> item < X)
                .forEach(item -> {
                    try {
                        bw.write(item + " ");
                    } catch (IOException e) { }
                });
        bw.newLine();
        bw.flush();
        bw.close();
    }
}