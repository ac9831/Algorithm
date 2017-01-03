package codility;

import java.util.Stack;

/**
 * 괄호 문제는 항상 빠트리는건데
 * 제발좀 마지막에 스택 비어있는지좀 봐라...;
 */
public class Nesting {
    public static void main(String[] args) {
        String S = "()(()()(((()())(()()))";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == '(') {
                st.push(S.charAt(i));
            } else {
                if(st.empty()) {
                    System.out.println(0);
                    break;
                } else {
                    st.pop();
                }
            }
        }
        if(!st.empty()) {
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }
}
