import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * P3003
 */
public class P3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] black = new int[] { 1, 1, 2, 2, 2, 8 };
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i : black) {
            bw.write((i - Integer.parseInt(st.nextToken())) + " ");
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }
}