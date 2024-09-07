import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// v는 최대 100,000 * 1,000,000 만큼 늘어날 수 있어서 Long 자료형 사용
		long[] cArr = new long[2];
		boolean isFail = false;
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String c = st.nextToken();
			long v = Long.parseLong(st.nextToken());
			
			if("in".equals(c)) {
				cArr[0] += v;
			} else {
				cArr[1] += v;
			}
			
			// 지출해야 할 돈이 현재 가지고 있는 돈보다 크면, 이후 수입과 상관없이 실패로 처리
			if("out".equals(c) && cArr[0] <= v) {
				isFail = true;
				break;
			}
		}
		
		if(cArr[0] - cArr[1] >= 0) {
			System.out.println("success");
		} else if(isFail) {
			System.out.println("fail");
		} else {
			System.out.println("fail");
		}
	}
}