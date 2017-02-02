package codility;

import java.util.Arrays;

/**
 * 간단한 문제
 * 하지만 생각하지 못한 방법
 * 슬라이드, 즉 특정 구간의 합의 최대값은 단순하게 말하면
 * 어디까지의 합이 가장 높은지를 알면 된다.
 * 이 문제는 3군데의 점을 잡는 것이니 2개의 부분이 나온다.
 * 첫번째 부분의 최대값 + 두번째 부분의 최대값을 구하면 이 문제는 해결되는 것이다..
 */
public class MaxDoubleSliceSum {
    public static int solution(int[] A) {
        int[] front = new int[A.length];
        int[] end = new int[A.length];

        front[0] = 0;
        front[1] = A[1];
        for(int i=2;i<A.length-1;i++) {
            front[i] = Math.max(A[i], A[i] + front[i-1]);
        }

        end[0] = 0;
        end[1] = A[A.length-2];
        for(int i=2;i<A.length-1;i++) {
            end[i] = Math.max(A[A.length-1-i], A[A.length-i-1] + end[i-1]);
        }

        int ret = 0;
        int current = 0;
        for(int i=1;i<A.length-1;i++) {
            current = Math.max(0, front[i-1]) + Math.max(0,end[A.length-1-(i+1)]);
            ret = Math.max(current, ret);
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] a = {3,2,6,-1,4,5,-1,2};
        System.out.println(solution(a));
    }
}
