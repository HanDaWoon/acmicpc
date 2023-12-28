import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * P2908
 */
public class P2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        Integer B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        if (A > B) {
            System.out.println(A);
            return;
        }
        System.out.println(B);
    }
}