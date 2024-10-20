import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);  // 필요한 줄 개수
        int M = Integer.parseInt(input[1]);  // 브랜드 개수
        
        int minPackPrice = Integer.MAX_VALUE;  // 패키지 최소 가격
        int minSinglePrice = Integer.MAX_VALUE;  // 낱개 최소 가격
        
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int packPrice = Integer.parseInt(st.nextToken());
            int singlePrice = Integer.parseInt(st.nextToken());
            
            minPackPrice = Math.min(minPackPrice, packPrice);  // 최소 패키지 가격 갱신
            minSinglePrice = Math.min(minSinglePrice, singlePrice);  // 최소 낱개 가격 갱신
        }
        
        // 1. 패키지로만 구매하는 경우
        int costWithPackOnly = ((N / 6) + 1) * minPackPrice;
        
        // 2. 낱개로만 구매하는 경우
        int costWithSingleOnly = N * minSinglePrice;
        
        // 3. 패키지와 낱개를 혼합 구매하는 경우
        int costWithMix = (N / 6) * minPackPrice + (N % 6) * minSinglePrice;
        
        // 세 가지 경우 중 최소값 선택
        int minCost = Math.min(costWithPackOnly, Math.min(costWithSingleOnly, costWithMix));
        
        System.out.println(minCost);
    }
}