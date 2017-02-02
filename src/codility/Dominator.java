package codility;

import java.util.HashMap;

/*
Map을 활용하여 각 숫자의 갯수를 체크하고 length/2 보다 큰 숫자를 찾음
 */
public class Dominator {

    public static void main(String[] args) {
        int[] ary = {0, 0, 1, 1, 1};
        System.out.println(solution(ary));
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int ret = -1;

        for(int i=0;i<A.length;i++) {
            if(!map.containsKey(A[i])) {
                map.put(A[i],1);
            } else {
                int cnt = map.get(A[i]);
                map.put(A[i],++cnt);
            }

            if(map.get(A[i]) > A.length/2 ) {
                ret = A[i];
                break;
            }
        }

        if(ret == -1) {
            return ret;
        } else {
            for(int i=0;i<A.length;i++) {
                if(ret == A[i]) {
                    return i;
                }
            }
        }

        return -1;
    }
}
