import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * P2566
 */
public class P2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int maxVal = Integer.MIN_VALUE;
        int curVal;
        int maxX = 1, maxY = 1;
        int curX = 1, curY = 1;
        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            curX = 1;
            while (st.hasMoreTokens()) {
                curVal = Integer.parseInt(st.nextToken());
                if (curVal > maxVal) {
                    maxX = curX;
                    maxY = curY;
                    maxVal = curVal;
                }
                curX++;
            }
            curY++;
        }
        bw.write(maxVal + "\n");
        bw.write(maxY + " " + maxX + "\n");
        bw.flush();
        bw.close();
    }
}