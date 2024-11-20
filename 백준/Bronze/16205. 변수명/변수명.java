import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt(); // 표기법 번호
        String str = sc.next(); // 변수명
        sc.close();

        // 입력 검증
        if (type < 1 || type > 3 || str.length() > 100) {
            System.out.println("Invalid input");
            return;
        }

        List<String> list = new ArrayList<>();

        // 카멜 표기법 처리
        if (type == 1) {
            int start = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    if (start < i) list.add(str.substring(start, i));
                    start = i;
                }
            }
            if (start < str.length()) list.add(str.substring(start));

        // 스네이크 표기법 처리
        } else if (type == 2) {
            if (!isSnakeCase(str)) { // 스네이크 표기법 검증
                System.out.println("Invalid input");
                return;
            }
            String[] parts = str.split("_");
            for (String part : parts) {
                if (!part.isEmpty()) list.add(part);
            }

        // 파스칼 표기법 처리
        } else if (type == 3) {
            int start = 0;
            for (int i = 1; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    if (start < i) list.add(str.substring(start, i));
                    start = i;
                }
            }
            if (start < str.length()) list.add(str.substring(start));
        }

        System.out.print(makeNotation(list));
    }

    // 스네이크 표기법 검증 메서드
    private static boolean isSnakeCase(String str) {
        return str.matches("^[a-z]+(_[a-z]+)*$");
    }

    // 표기법 변환 메서드
    static StringBuilder makeNotation(List<String> list) {
        StringBuilder sb = new StringBuilder();

        // 카멜 표기법 (camelCase)
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                sb.append(list.get(i).toLowerCase());
            } else {
                sb.append(Character.toUpperCase(list.get(i).charAt(0)));
                sb.append(list.get(i).substring(1).toLowerCase());
            }
        }
        sb.append("\n");

        // 스네이크 표기법 (snake_case)
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toLowerCase());
            if (i != list.size() - 1) sb.append("_");
        }
        sb.append("\n");

        // 파스칼 표기법 (PascalCase)
        for (String part : list) {
            sb.append(Character.toUpperCase(part.charAt(0)));
            sb.append(part.substring(1).toLowerCase());
        }
        sb.append("\n");

        return sb;
    }
}