import java.util.*;
import java.util.Queue;
import java.util.Stack;

public class DFS_BFS {

    private static int[][] map = new int[1001][1001];

    private static int visit[] = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = 1;
            map[y][x] = 1;
        }
        System.out.print(v);
        DFS(n, v);
        System.out.println();
        BFS(n, v);
    }

    public static void DFS(int n, int v){

        visit[v] = 1;
        for (int i = 1; i <= n; i++) {
            if (map[v][i] == 1 && visit[i] == 0) {
                System.out.print(" " + i);
                DFS(n, i);
            }
        }
    }

    public static void BFS(int n, int v){
        int queue[] = new int[1000];
        visit = new int[1001];
        int front = 0, rear = 0, tmp = v;

        visit[tmp] = 1;
        queue[rear++] = tmp;
        System.out.print(tmp);
        while(front < rear) {
            tmp = queue[front++];
            for(int i=1;i<=n;i++){
                if(map[tmp][i] == 1 && visit[i] == 0) {
                    visit[i] = 1;
                    System.out.print(" " + i);
                    queue[rear++] = i;
                }
            }
        }
        System.out.println();

    }

}