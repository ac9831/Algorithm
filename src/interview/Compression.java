package interview;

import java.util.Scanner;

/**
 * Created by gunjunLee on 2016-11-30.
 */
public class Compression {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for(int i=0;i<str.length();i++){

            if(i==0){
                sb.append(str.charAt(i));
            }else{
                if(str.charAt(i) != str.charAt(i-1)){
                    sb.append(cnt);
                    cnt = 1;
                    sb.append(str.charAt(i));
                }else{
                    cnt++;
                }
            }
        }
        sb.append(cnt);

        System.out.println(sb.toString());
    }
}
