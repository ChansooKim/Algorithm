import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		input = input.trim();	// 앞 뒤 공백제거
		if(input.isEmpty()) {
			System.out.println(0);
		} else {
			input = input.replaceAll("\\s+", " ");	// 한 개 이상의 공백을 한 개의 공백으로 변경
			
			String[] arr = input.split(" ");
			System.out.println(arr.length);
		}
	}
}