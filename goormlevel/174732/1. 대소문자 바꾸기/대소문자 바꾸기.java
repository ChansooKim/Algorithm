import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String str = br.readLine();
		
		int len = Integer.parseInt(input);
		for(int i=0; i<len; i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(String.valueOf(ch).toLowerCase());
			} else if(Character.isLowerCase(ch)) {
				System.out.print(String.valueOf(ch).toUpperCase());
			}
		}
	}
}