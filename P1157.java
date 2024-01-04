import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * P1157
 */
public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Character, Long> rs = br.readLine().toUpperCase().chars().mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Entry<Character, Long> max = rs.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        bw.write(rs.entrySet().stream().filter(e -> e.getValue().equals(max.getValue())).count() == 1
                ? max.getKey() + ""
                : "?");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}