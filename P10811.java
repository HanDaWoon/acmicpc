import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * P10811
 */
public class P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for (int i = 1; i <= N; i++) {
            basket[i - 1] = i;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            reverse(basket, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        for (int ball : basket) {
            bw.write(ball + " ");
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }

    private static void reverse(int[] arr, int idx1, int idx2) {
        int[] tmp = Arrays.copyOfRange(arr, idx1 - 1, idx2);
        for (int i = 0; i < tmp.length; i++) {
            arr[idx2 - i - 1] = tmp[i];
        }
    }
}