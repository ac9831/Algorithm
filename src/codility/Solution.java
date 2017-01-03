package codility;

import java.util.*;

/**
 * Created by gunjunLee on 2017-01-03.
 */
public class Solution {
    public static void main(String[] args) {
        int[] H = {8,8,5,7,9,8,7,4,8};
        Stack<Integer> st = new Stack<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        int min = 0;
        int ret = 0;
        for(int i=0;i<H.length;i++) {

            if(st.empty()) {
                min = H[i];
                st.add(H[i]);
            } else if(min > H[i]) {
                for(int j=0;j<st.size();j++) {
                    set.add(st.pop());
                }
                ret += set.size();
            } else {
                st.add(H[i]);
            }

        }
        System.out.println(ret);
    }
}
