package codility;

import java.util.HashMap;

/**
 * Created by gunjunLee on 2017-01-20.
 */
public class EquiLeader {

    public static void main(String[] args) {

        int[] A = {4, 4, 2, 5, 3, 4, 4, 4};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ret = -1;

        for(int i=0;i<A.length;i++) {
            if(map.containsKey(A[i])) {
                int cnt = map.get(A[i]);
                map.put(A[i],++cnt);
            } else {
                map.put(A[i],1);
            }
            if(map.get(A[i]) > A.length/2 ) {
                ret = A[i];
                break;
            }
        }
        if(ret == -1) {
            return 0;
        }
        int[] cnts = new int[A.length];
        int cnt = 0;
        for(int i=0;i<A.length;i++) {

            if(A[i] == ret) {
                ++cnt;
            }
            cnts[i] = cnt;
        }

        ret = 0;
        for(int i=0;i<A.length-1;i++) {
            if(cnts[i]*2 > i+1 && (cnt-cnts[i])*2 > (A.length-i-1)) {
                ret++;
            }
        }

        return ret;
    }
}
