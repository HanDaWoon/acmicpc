import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * P2562
 */
public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxVal = Integer.MIN_VALUE;
        int maxIdx = 0;
        for (int i = 1; i < 10; i++) {
            int curVal = Integer.parseInt(br.readLine());
            if (curVal > maxVal) {
                maxVal = curVal;
                maxIdx = i;
            }
        }
        System.out.println(maxVal);
        System.out.println(maxIdx);
    }
}