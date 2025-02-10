import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Integer>[] graph;
    static boolean visited[];
    static int delete;
    static int parent[];
    static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        parent = new int[N+1];

        for(int i=0; i<N; i++) {
            graph[i] = new ArrayList<>();
        }
        int root = -1;
        for(int i=0; i<N; i++) {
            int p = sc.nextInt();
            if(p==-1) {
                root = i;
            } else {
                graph[i].add(p);
                graph[p].add(i);
            }
        }
        delete = sc.nextInt();
        if(delete==root) {
            ans = 0;
        } else {
            dfs(root);
        }
        System.out.println(ans);
    }

    static void dfs(int v) {
        visited[v] = true;
        int nodes = 0;
        for(int cur : graph[v]) {
            if(cur != delete && !visited[cur]) {
                nodes++;
                dfs(cur);
            }
        }
        if(nodes == 0) {
            ans++;
        }
    }
}