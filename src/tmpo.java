import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gunjunLee on 2016-10-19.
 */
public class tmpo {

    static char[][] map;
    static int[][] mapVal;
    static int n;
    static int[][] visitmap;
    static int[] dy = { -1, 0, 0, 1, -1, -1, 1, 1};
    static int[] dx = { 0, -1, 1, 0, -1, 1, -1, 1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        map = new char[n][n];

        mapVal = new int[n][n];
        List<Integer> sortVal = new ArrayList<Integer>();

        int startX = 0;
        int startY = 0;
        int KCount = 0;

        for(int i=0;i<n;i++){
            String tmp = sc.next();
            for(int j=0;j<n;j++){
                map[i][j] = tmp.charAt(j);
                if(tmp.charAt(j) == 'P'){
                    startX = j;
                    startY = i;
                }
                if(tmp.charAt(j) == 'K'){
                    KCount++;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mapVal[i][j] = sc.nextInt();
                sortVal.add(mapVal[i][j]);
            }
        }

        Collections.sort(sortVal);

        List<Integer> val = new ArrayList<Integer>();

        for(int i=0;i<sortVal.size()-1;i++){
            if(sortVal.get(i) != sortVal.get(i+1)){
                val.add(sortVal.get(i));
            }
        }
        if(val.get(val.size()-1) != sortVal.get(sortVal.size()-1)){
            val.add(sortVal.get(sortVal.size()-1));
        }

        int ans = Integer.MAX_VALUE;
        int s = 0, e =0;
        while(e<val.size()){
            visitmap = new int[n][n];

            visitmap[startY][startX] = 1;

            if(DFS(val.get(s), val.get(e),startX,startY) == KCount){
                if(val.get(e) - val.get(s) < ans){
                    ans = val.get(e) - val.get(s);
                    s++;
                }
            }else{
                e++;
            }
        }
        System.out.println(ans);

    }


    public static int DFS(int min, int max, int X, int Y) {
        int ret = 0;

        if(mapVal[Y][X] > max || mapVal[Y][X] < min) return 0;
        if(map[Y][X] == 'K'){
            ret = 1;
        }

        for(int i=0;i<8;i++){
            int nextX = X + dx[i];
            int nextY = Y + dy[i];
            if(nextY >= 0 && nextY < n && nextX >= 0 && nextX < n){
                if(visitmap[nextY][nextX] == 0){
                    visitmap[nextY][nextX] = 1;
                    ret += DFS(min, max, nextX, nextY);
                }
            }
        }

        return ret;

    }
}
