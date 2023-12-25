import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * P14681
 */
public class P14681 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
                return;
            }
            System.out.println(4);
        }
        if (x < 0) {
            if (y > 0) {
                System.out.println(2);
                return;
            }
            System.out.println(3);
        }
    }
}