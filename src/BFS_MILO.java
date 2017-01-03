import java.util.Scanner;

/**
 * Created by gunjunLee on 2016-10-14.
 */
public class BFS_MILO {

    private static int[][] map = null;
    private static int n = 0;
    private static int m = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][m];
        String[] tmp = new String[n];

        for(int i=0;i<n;i++) {
            tmp[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                map[i][j] = Integer.parseInt(Character.toString(tmp[i].charAt(j)));
            }
        }

        DFS(0,0);


    }

    public static void DFS(int x, int y) {
        int front = 0;
        int rear = 1;
        int cnt[][] = new int[101][101];
        int queue[][] = new int[10002][2];

        queue[0][0] = x;
        queue[0][1] = y;

        cnt[x][y] = 1;

        while(front < rear) {

            x = queue[front][0];
            y = queue[front][1];
            front++;
            if(x + 1 < m && map[y][x+1] == 1 && cnt[y][x+1] == 0) {
                cnt[y][x+1] = cnt[y][x] + map[y][x+1];
                queue[rear][0] = x+1;
                queue[rear][1] = y;
                rear++;
            }
            if(x-1 >= 0 && map[y][x-1] == 1 && cnt[y][x-1] == 0) {
                cnt[y][x-1] = cnt[y][x] + map[y][x-1];
                queue[rear][0] = x-1;
                queue[rear][1] = y;
                rear++;
            }

            if(y-1 >= 0 && map[y-1][x] == 1 && cnt[y-1][x] == 0) {
                cnt[y-1][x] = cnt[y][x] + map[y-1][x];
                queue[rear][0] = x;
                queue[rear][1] = y-1;
                rear++;
            }

            if(y + 1 < n && map[y+1][x] == 1 && cnt[y+1][x] == 0) {
                cnt[y+1][x] = cnt[y][x] + map[y+1][x];
                queue[rear][0] = x;
                queue[rear][1] = y+1;
                rear++;
            }

        }

        System.out.println(cnt[n-1][m-1]);



    }
}
