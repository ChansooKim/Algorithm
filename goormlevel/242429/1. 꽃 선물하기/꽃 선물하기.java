import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// 선물할 사람
		
		String[] output = new String[N];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a < b) output[i] = "Sunflower";
			else if(a == b) output[i] = "Tulip";
			else if(a > b) output[i] = "Rose";
		}
		
		for(String print : output) {
			System.out.println(print);
		}
		
	}
}