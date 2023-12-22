import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        String second = br.readLine();
        System.out.println(first * (second.charAt(2) - '0'));
        System.out.println(first * (second.charAt(1) - '0'));
        System.out.println(first * (second.charAt(0) - '0'));
        System.out.println(first * Integer.parseInt(second));
    }
}