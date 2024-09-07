import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] strArr = input.split(" ");
		double word1 = Double.parseDouble(strArr[0]);
		double word2 = Double.parseDouble(strArr[1]);
		double sumWord = word1 + word2;
		
		System.out.printf("%.6f%n", sumWord);
	}
}