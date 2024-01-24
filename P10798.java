import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * P10798
 */
public class P10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] tmp = new char[5][15];
        String l;
        
        for (int i = 0; i < 5; i++) {
            l = br.readLine();
            for (int j = 0; j < l.length(); j++) {
                tmp[i][j] = l.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (tmp[j][i] != '\0') {
                    bw.write(tmp[j][i]);
                }
            }
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }
}