package codility;

/**
 * 구간 별로 가장 큰 합을 구해서 반환
 * ret 배열에서 0보다 작으면 그 순서부터 다시 시작
 * 0보다 작은 숫자들만 있을 경우를 대비해 마지막 처리를 한다.
 */
public class MaxSliceSum {

    public static void main(String[] args) {
        int[] A = {-2, -2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int[] ret = new int[A.length];
        if(A[0] < 0) {
            ret[0] = 0;
        } else {
            ret[0] = A[0];
        }

        int max = ret[0];
        for(int i=1;i<A.length;i++) {
            ret[i] = ret[i-1] + A[i];
            if(ret[i] < 0) {
                ret[i] = 0;
            }
            if (max < ret[i]) {
                max = ret[i];
            }
        }


        if(max == 0) {
            max = Integer.MIN_VALUE;
            for(int i=0;i<A.length;i++) {
                if(max < A[i]) {
                    max = A[i];
                }
            }
        }


        return max;
    }
}
