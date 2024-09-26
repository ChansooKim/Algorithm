import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        while(!(input=br.readLine()).equals(".")) {
            char[] arr = input.toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for(char x : arr) {
                if(x=='(' || x=='[') {
                    stack.push(x);
                } else if(x==')' || x==']') {
                    if(!stack.isEmpty()) {
                        if(x==')') {
                            if(stack.peek()=='(') stack.pop();
                            else {
                                check = false;
                                break;
                            }
                        } else if(x==']') {
                            if(stack.peek()=='[') stack.pop();
                            else {
                                check = false;
                                break;
                            }
                        }
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            if(stack.isEmpty() && check) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }
}