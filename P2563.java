import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * P2563
 */
public class P2563 {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] paper = new int[101][101];
        AtomicInteger ai = new AtomicInteger(0);
        br.readLine();
        br.lines().forEach(l -> {
            st = new StringTokenizer(l);
            stick(paper, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        });

        Arrays.stream(paper).forEach(arr -> Arrays.stream(arr).forEach(i -> {
            if (i == 1)
                ai.incrementAndGet();
        }));

        bw.write(ai.get() + "\n");
        bw.flush();
        bw.close();
    }

    private static void stick(int[][] arr, int x, int y) {
        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                arr[i][j] = 1;
            }
        }
    }
}