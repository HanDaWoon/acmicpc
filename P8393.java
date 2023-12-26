import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.concurrent.atomic.AtomicInteger;

/**
 * P8393
 */
public class P8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(sum2(n));
    }

    // private static int sum1(int n) {
    //     AtomicInteger sum = new AtomicInteger(0);
    //     for (int i = 1; i <= n; i++) {
    //         sum.addAndGet(i);
    //     }
    //     return sum.get();
    // }

    private static int sum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}