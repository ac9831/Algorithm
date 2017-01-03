package codility;

import java.util.Stack;

/**
 * 문제 정의를 잘해서 한방에 100% 나온 코드
 * 어떤 조건이 있는지 잘 정의해야 한다는 것을 다시 한번 상기
 * stack 사용하는 문제는 while문 잘 활용하면 해결이 잘된다.
 */
public class Fish {
    public static void main(String[] args) {
        int[] A = {4,3,2,1,5,2,3,0,1,0};
        int[] B = {0,1,0,0,0,1,0,0,0,0};
        Stack<Integer> stUp = new Stack<>();
        Stack<Integer> stDown = new Stack<>();

        int cnt = 0;
        for(int i=0;i<A.length;i++){
            if(stDown.empty() && B[i] == 0) {
                System.out.println(A[i]);
                cnt++;
            } else if(!stDown.empty() && B[i] == 0) {
                while(!stDown.empty()) {
                    if(A[i] > stDown.peek()) {
                        stDown.pop();
                    } else {
                        break;
                    }
                }
                if(stDown.empty()) {
                    cnt++;
                    stUp.push(A[i]);
                }
            } else {
                stDown.push(A[i]);
            }
        }
        System.out.println(cnt + stDown.size());


    }
}
