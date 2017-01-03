package interview;

import java.util.Scanner;

/**
 * Created by gunjunLee on 2016-11-30.
 */
public class uniqueCharacter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] ch = new int[26];

        boolean ret = true;
        for(int i=0;i<input.length();i++){
            int tmp = input.charAt(i)-65;
            if(tmp < 26){
                if(ch[tmp] == 0){
                    ch[tmp] = 1;
                }else{
                    ret = false;
                    break;
                }
            }else{
                if(ch[tmp-32] == 0){
                    ch[tmp-32] = 1;
                }else{
                    ret = false;
                    break;
                }
            }

        }
        System.out.println(ret);
    }
}
