package hand_coding;

import java.util.Stack;

/**
 * Created by gunjunLee on 2016-11-14.
 */
public class Bracket {

    public static void main(String[] args){

        String brac = new String("(()");

        System.out.println(brack(brac));

    }


    public static boolean brack(String bar){

        boolean b = true;
        int len = bar.length();
        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<len;i++){
            if(bar.charAt(i) == '{' || bar.charAt(i) == '(' || bar.charAt(i) == '['){
                st.push(bar.charAt(i));
            }else if(!st.empty()){
                if(bar.charAt(i) == '}'){
                    if(st.peek() != '{'){
                        b = false;
                        break;
                    }else{
                        st.pop();
                    }
                }else if(bar.charAt(i) == ')'){
                    if(st.peek() != '('){
                        b = false;
                        break;
                    }else{
                        st.pop();
                    }
                }else if(bar.charAt(i) == ']'){
                    if(st.peek() != '['){
                        b = false;
                        break;
                    }else{
                        st.pop();
                    }
                }
            }else{
                b = false;
                break;
            }
        }

        if(!st.empty()){
            b = false;
        }



        return b;
    }

}
