import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * P9498
 */
public class P9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int socre = Integer.parseInt(br.readLine());

        if (socre >= 90) {
            System.out.println("A");
            return;
        }
        if (socre >= 80) {
            System.out.println("B");
            return;
        }
        if (socre >= 70) {
            System.out.println("C");
            return;
        }
        if (socre >= 60) {
            System.out.println("D");
            return;
        }
        System.out.println("F");
    }
}