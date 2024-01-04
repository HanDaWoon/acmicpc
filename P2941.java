import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * P2941
 */
public class P2941 {
    static String s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] ca = new String[] {
                "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
        };
        s = br.readLine();
        Arrays.stream(ca).forEach(c -> s = s.replaceAll(c, "a")); // Use s in lambda expression
        bw.write(s.length() + "");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}