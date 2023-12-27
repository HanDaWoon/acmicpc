import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * P10813
 */
public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int b_i = Integer.parseInt(st.nextToken());
            int b_j = Integer.parseInt(st.nextToken());
            change(basket, b_i, b_j);
        }
        for (int i = 1; i < basket.length; i++) {
            bw.write(basket[i] + " ");
        }

        bw.newLine();
        bw.flush();
        bw.close();
    }

    private static void change(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}