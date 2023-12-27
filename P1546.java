import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * P1546
 */
public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> scores = new ArrayList<>();
        while (st.hasMoreTokens()) {
            scores.add(Integer.parseInt(st.nextToken()));
        }
        scores.stream().mapToInt(i -> i).max().ifPresent(max -> {
            scores.stream().mapToDouble(i -> (double) i / max * 100).average().ifPresent(avg -> {
                System.out.println(avg);
            });
        });
    }
}