package codility;

import java.util.*;

/**
 * 중복 체크를 Set를 통해 해결할려고 했으나 삽질...
 * Stack에 넣고 빼고만으로 가능
 * 아래 조건문과 같이 stack이 안비어 있고 스택에 들어가잇는 마지막 숫자랑 배열 H[i]의 값이 같으면 걍 넘기면 된다.......
 * 문제의 조건을 명확히 알아야 한다.
 */
public class StoneWall {
    public static void main(String[] args) {
        int[] H = {1};
        Stack<Integer> st = new Stack<Integer>();
        int ret = 0;
        for(int i=0;i<H.length;i++) {
            while(!st.empty() && H[i] < st.peek()) {
                st.pop();
            }
            if(!st.empty() && st.peek() == H[i]) {
                continue;
            }
            st.push(H[i]);
            ret++;
        }
        System.out.println(ret);
    }
}
