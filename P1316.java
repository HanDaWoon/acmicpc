import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * P1316
 */
public class P1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            boolean[] check = new boolean[26];
            boolean flag = true;

            for (int j = 0; j < s.length(); j++) {
                if (check[s.charAt(j) - 'a']) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        flag = false;
                        break;
                    }
                }
                check[s.charAt(j) - 'a'] = true;
            }
            if (flag) {
                count++;
            }
        }

        bw.write(count + "");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}