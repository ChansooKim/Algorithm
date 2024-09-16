import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            sb.append(checkPS(input)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    private static String checkPS(String str) {
        String bool = "YES";
        Stack<Character> stack = new Stack<>();
        char[] chArr = str.toCharArray();
        for(int i=0; i<chArr.length; i++) {
            if(chArr[i] == '(') {
                stack.push(chArr[i]);
            } else {
                if(stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) bool = "NO";
        return bool;
    }
}