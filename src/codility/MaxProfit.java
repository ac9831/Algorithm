package codility;

/**
 * 이런 류의 문제는
 * 중간의 범위를 나누어 생각해 볼 필요가 있다.
 * 이번 문제는 배열 뒤에서 앞으로 빼서 가장 큰 값을 뽑는 것 만큼
 * 뒤 - 앞 을 했을 때 음수가 나오면 그 앞의 숫자를 뒤로 바꿔주면 된다.
 */
public class MaxProfit {

    public void main(String[] args) {

    }

    public int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int ret = 0;
        int j = A[0];
        for(int i=1;i<A.length;i++) {
            if(A[i] - j < 0 ) {
                j = A[i];
            } else {
                if (ret < A[i] - j) {
                    ret = A[i] - j;
                }
            }
        }

        return ret;


    }
}
