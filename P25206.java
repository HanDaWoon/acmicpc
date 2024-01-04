import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * P25206
 */
public class P25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        double totalCredit = 0;
        double gpa = 0;
        double grade;
        double credit;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            credit = Double.parseDouble(st.nextToken());
            grade = getGrade(st.nextToken());
            if (grade == -1)
                continue;
            totalCredit += credit;
            gpa += credit * grade;
        }
        bw.write(gpa / totalCredit + "");
        bw.newLine();
        bw.flush();
        bw.close();
    }

    private static double getGrade(String grade) {
        switch (grade) {
            case "P":
                return -1;
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0;
        }
    }
}