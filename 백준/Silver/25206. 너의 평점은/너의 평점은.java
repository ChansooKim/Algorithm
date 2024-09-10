import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0.0;
        double total = 0.0;
        double answer;
        for(int i=0; i<20; i++) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            if("P".equals(arr[2])) continue;
            double score = Double.parseDouble(arr[1]);
            double grade = getGrade(arr[2]);
            total += score;
            sum += score*grade;
        }
        answer = sum/total;
        System.out.printf("%f", answer);
    }

    static double getGrade(String grade) {
        switch(grade) {
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
                return 0.0;
        }
        /*return switch (grade) {
            case "A+" -> 4.5;
            case "A0" -> 4.0;
            case "B+" -> 3.5;
            case "B0" -> 3.0;
            case "C+" -> 2.5;
            case "C0" -> 2.0;
            case "D+" -> 1.5;
            case "D0" -> 1.0;
            default -> 0.0;
        };*/
    }
}